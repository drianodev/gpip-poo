package test;

import main.entity.Localizacao;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LocalizacaoTest {

    @Test
    public void testConstrutorEGetters() {
        Localizacao localizacao = new Localizacao("Rua A", "123", "Bairro1", "Cidade1", "Estado1", "12345-678");

        assertEquals(1, localizacao.getId());
        assertEquals("Rua A", localizacao.getLogradouro());
        assertEquals("123", localizacao.getNumero());
        assertEquals("Bairro1", localizacao.getBairro());
        assertEquals("Cidade1", localizacao.getCidade());
        assertEquals("Estado1", localizacao.getEstado());
        assertEquals("12345-678", localizacao.getCep());
    }
}
