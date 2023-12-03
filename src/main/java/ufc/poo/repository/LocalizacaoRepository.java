package ufc.poo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import ufc.poo.model.entity.Localizacao;

import java.util.List;
import java.util.UUID;

public class LocalizacaoRepository {

    private EntityManager em;
    private final EntityManagerFactory emf;

    public LocalizacaoRepository() {
        this.em = null;
        this.emf = Persistence.createEntityManagerFactory("gpipPU");
    }

    public void salvarLocalizacao(Localizacao localizacao) {
        em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(localizacao);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Localizacao buscarPorId(UUID id) {
        em = emf.createEntityManager();
        try {
            return em.find(Localizacao.class, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Localizacao> listarTodas() {
        em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT i FROM Localizacao i", Localizacao.class).getResultList();
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
