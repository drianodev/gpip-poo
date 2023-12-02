package test;

import main.entity.Usuario;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsuarioTest {

    @Before
    public void setUp() {
        // Limpa o mapa de usuários cadastrados antes de cada teste
        Usuario.getUsuariosCadastrados().clear();
    }

    @Test
    public void testCadastrar() {
        assertTrue(Usuario.cadastrar("usuario1@example.com", "Usuario1", "senha123"));
        assertFalse(Usuario.cadastrar("usuario1@example.com", "Usuario2", "senha456")); // Email já cadastrado
    }

    @Test
    public void testFazerLogin() {
        // Cadastra um usuário
        Usuario.cadastrar("usuario1@example.com", "Usuario1", "senha123");

        assertTrue(Usuario.fazerLogin("usuario1@example.com", "senha123")); // Login bem-sucedido
        assertFalse(Usuario.fazerLogin("usuario1@example.com", "senha456")); // Senha incorreta
        assertFalse(Usuario.fazerLogin("usuario2@example.com", "senha123")); // Usuário não cadastrado
    }

    @Test
    public void testGettersAndSetters() {
        Usuario usuario = new Usuario("usuario1@example.com", "Usuario1", "senha123");

        assertEquals("usuario1@example.com", usuario.getEmail());
        assertEquals("Usuario1", usuario.getNome());
        assertEquals("senha123", usuario.getSenha());

        usuario.setEmail("usuario2@example.com");
        usuario.setNome("Usuario2");
        usuario.setSenha("novaSenha456");

        assertEquals("usuario2@example.com", usuario.getEmail());
        assertEquals("Usuario2", usuario.getNome());
        assertEquals("novaSenha456", usuario.getSenha());
    }
}
