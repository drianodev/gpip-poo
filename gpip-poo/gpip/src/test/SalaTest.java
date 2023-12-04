package test;

import main.entity.Instituicao;
import main.entity.Localizacao;
import main.entity.Sala;
import main.entity.Usuario;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalaTest {

    @Test
    public void testConstrutorEGetters() {
        Localizacao localizacao = new Localizacao("Rua B", "456", "Bairro2", "Cidade2", "Estado2", "54321-987");
        Usuario usuario = new Usuario("exemplo2@dominio.com", "Usuario Exemplo 2", "senha456");
        Instituicao instituicao = new Instituicao("Instituicao B", localizacao, usuario);
        Sala sala = new Sala(101, 1, instituicao);

        assertEquals(101, sala.getUnidade());
        assertEquals(1, sala.getNumeroDaSala());
        assertEquals(instituicao, sala.getInstituicao());
    }

}
