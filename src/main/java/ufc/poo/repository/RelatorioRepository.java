package ufc.poo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import ufc.poo.model.entity.Relatorio;

import java.util.List;
import java.util.UUID;

public class RelatorioRepository {

    private EntityManager em;
    private final EntityManagerFactory emf;

    public RelatorioRepository() {
        this.em = null;
        this.emf = Persistence.createEntityManagerFactory("gpipPU");
    }

    public void salvarRelatorio(Relatorio relatorio) {
        em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(relatorio);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Relatorio buscarPorId(UUID id) {
        em = emf.createEntityManager();
        try {
            return em.find(Relatorio.class, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Relatorio> listarTodos() {
        em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT r FROM Relatorio r", Relatorio.class).getResultList();
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
