package ufc.poo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import ufc.poo.model.entity.Servidor;

import java.util.List;
import java.util.UUID;

public class ServidorRepository {

    private EntityManager em;
    private final EntityManagerFactory emf;

    public ServidorRepository() {
        this.em = null;
        this.emf = Persistence.createEntityManagerFactory("gpipPU");
    }

    public void salvarServidor(Servidor servidor) {
        em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            if (!em.contains(servidor)) {
                // Se a entidade não está gerenciada, carregue-a novamente ou use merge
                servidor = em.merge(servidor);
            }
            em.persist(servidor);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Servidor buscarPorId(UUID id) {
        em = emf.createEntityManager();
        try {
            return em.find(Servidor.class, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Servidor> listarTodos() {
        em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT i FROM Servidor i", Servidor.class).getResultList();
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
