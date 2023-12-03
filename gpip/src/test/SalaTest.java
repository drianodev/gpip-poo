package test;

import main.model.Instituicao;
import main.model.Localizacao;
import main.model.Sala;
import main.model.Usuario;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalaTest {

    @Test
    public void testConstrutorEGetters() {
        Localizacao localizacao = new Localizacao(1, "Rua B", "456", "Bairro2", "Cidade2", "Estado2", "54321-987");
        Usuario usuario = new Usuario(2, "exemplo2@dominio.com", "Usuario Exemplo 2", "senha456");
        Instituicao instituicao = new Instituicao(2, "Instituicao B", localizacao, usuario);
        Sala sala = new Sala(1, 101, 1, instituicao);

        assertEquals(1, sala.getId());
        assertEquals(101, sala.getUnidade());
        assertEquals(1, sala.getNumeroDaSala());
        assertEquals(instituicao, sala.getInstituicao());
    }

}
