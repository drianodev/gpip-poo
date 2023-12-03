package ufc.poo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import ufc.poo.model.entity.Manutencao;

import java.util.List;
import java.util.UUID;

public class ManutencaoRepository {

    private EntityManager em;
    private final EntityManagerFactory emf;

    public ManutencaoRepository() {
        this.em = null;
        this.emf = Persistence.createEntityManagerFactory("gpipPU");
    }

    public void salvarManutencao(Manutencao manutencao) {
        em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(manutencao);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Manutencao buscarPorId(UUID id) {
        em = emf.createEntityManager();
        try {
            return em.find(Manutencao.class, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Manutencao> listarTodas() {
        em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT m FROM Manutencao m", Manutencao.class).getResultList();
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
