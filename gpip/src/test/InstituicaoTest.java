package test;

import main.model.Instituicao;
import main.model.Localizacao;
import main.model.Usuario;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstituicaoTest {

    @Test
    public void testConstrutorEGetters() {
        Localizacao localizacao = new Localizacao(1, "Rua A", "123", "Bairro1", "Cidade1", "Estado1", "12345-678");
        Usuario usuario = new Usuario(1, "exemplo@dominio.com", "Usuario Exemplo", "senha123");
        Instituicao instituicao = new Instituicao(1, "Instituicao A", localizacao, usuario);

        assertEquals(1, instituicao.getId());
        assertEquals("Instituicao A", instituicao.getNomeInstituicao());
        assertEquals(localizacao, instituicao.getLocalizacao());
        assertEquals(usuario, instituicao.getUsuario());
    }
}
