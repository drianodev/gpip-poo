package ufc.poo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import ufc.poo.model.entity.Sala;

import java.util.List;
import java.util.UUID;

public class SalaRepository {

    private EntityManager em;
    private final EntityManagerFactory emf;

    public SalaRepository() {
        this.em = null;
        this.emf = Persistence.createEntityManagerFactory("gpipPU");
    }

    public void salvarSala(Sala sala) {
        em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(sala);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Sala buscarPorId(UUID id) {
        em = emf.createEntityManager();
        try {
            return em.find(Sala.class, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Sala> listarTodas() {
        em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT s FROM Sala s", Sala.class).getResultList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void fecharConexao() {
        if ((emf != null && emf.isOpen()) && (em != null && em.isOpen())) {
            em.close();
            emf.close();
        }
    }
}
