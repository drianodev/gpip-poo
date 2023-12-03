package ufc.poo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import ufc.poo.model.entity.Usuario;

import java.util.List;
import java.util.UUID;

public class UsuarioRepository {

    private EntityManager em;
    private final EntityManagerFactory emf;

    public UsuarioRepository() {
        this.em = null;
        this.emf = Persistence.createEntityManagerFactory("gpipPU");
    }

    public void salvarUsuario(Usuario usuario) {
        em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            em.persist(usuario);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Usuario buscarPorId(UUID id) {
        em = emf.createEntityManager();
        try {
            return em.find(Usuario.class, id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Usuario> listarTodas() {
        em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT i FROM Usuario i", Usuario.class).getResultList();
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
