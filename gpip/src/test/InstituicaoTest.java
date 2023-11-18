package test;

import main.model.entity.Instituicao;
import main.model.entity.Localizacao;
import main.model.entity.Usuario;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstituicaoTest {

    @Test
    public void testConstrutorEGetters() {
        Localizacao localizacao = new Localizacao("Rua A", "123", "Bairro1", "Cidade1", "Estado1", "12345-678");
        Usuario usuario = new Usuario("exemplo@dominio.com", "Usuario Exemplo", "senha123");
        Instituicao instituicao = new Instituicao("Instituicao A", localizacao, usuario);

        assertEquals("Instituicao A", instituicao.getNomeInstituicao());
        assertEquals(localizacao, instituicao.getLocalizacao());
        assertEquals(usuario, instituicao.getUsuario());
    }
}
