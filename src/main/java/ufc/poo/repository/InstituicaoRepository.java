package ufc.poo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import ufc.poo.model.entity.Instituicao;

import java.util.List;
import java.util.UUID;

public class InstituicaoRepository {

    private EntityManager em;
    private final EntityManagerFactory emf;

    public InstituicaoRepository() {
        this.em = null;
        this.emf = Persistence.createEntityManagerFactory("gpipPU");
    }

    public void salvarInstituicao(Instituicao instituicao) {
        em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            if (!em.contains(instituicao)) {
                // Se a entidade não está gerenciada, carregue-a novamente ou use merge
                instituicao = em.merge(instituicao);
            }
            em.persist(instituicao);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Instituicao buscarPorId(UUID id) {
        em = emf.createEntityManager();
        try {
            return em.find(Instituicao.class, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Instituicao> listarTodas() {
        em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT i FROM Instituicao i", Instituicao.class).getResultList();
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
