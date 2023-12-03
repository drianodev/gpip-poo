package ufc.poo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import ufc.poo.model.entity.Movimentacao;

import java.util.List;
import java.util.UUID;

public class MovimentacaoRepository {

    private EntityManager em;
    private final EntityManagerFactory emf;

    public MovimentacaoRepository() {
        this.em = null;
        this.emf = Persistence.createEntityManagerFactory("gpipPU");
    }

    public void salvarMovimentacao(Movimentacao movimentacao) {
        em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(movimentacao);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Movimentacao buscarPorId(UUID id) {
        em = emf.createEntityManager();
        try {
            return em.find(Movimentacao.class, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Movimentacao> listarTodas() {
        em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT m FROM Movimentacao m", Movimentacao.class).getResultList();
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
