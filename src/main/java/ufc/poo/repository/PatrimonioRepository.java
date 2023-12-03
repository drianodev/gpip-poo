package ufc.poo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import ufc.poo.model.entity.Patrimonio;

import java.util.List;
import java.util.UUID;

public class PatrimonioRepository {

    private EntityManager em;
    private final EntityManagerFactory emf;

    public PatrimonioRepository() {
        this.em = null;
        this.emf = Persistence.createEntityManagerFactory("gpipPU");
    }

    public void salvarPatrimonio(Patrimonio patrimonio) {
        em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(patrimonio);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Patrimonio buscarPorId(UUID id) {
        em = emf.createEntityManager();
        try {
            return em.find(Patrimonio.class, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Patrimonio> listarTodos() {
        em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT p FROM Patrimonio p", Patrimonio.class).getResultList();
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
