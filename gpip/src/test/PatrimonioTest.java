package test;

import static org.junit.Assert.*;

import main.model.entity.Patrimonio;
import main.model.entity.Sala;
import org.junit.Test;
import java.util.Date;

public class PatrimonioTest {

    @Test
    public void testGetId() {
        Patrimonio patrimonio = new Patrimonio("PT123", "Descrição do Patrimônio", "Bom estado", new Date(), null, null);
        assertEquals(1, patrimonio.getId());
    }

    @Test
    public void testGetNumeroTombo() {
        Patrimonio patrimonio = new Patrimonio("PT123", "Descrição do Patrimônio", "Bom estado", new Date(), null, null);
        assertEquals("PT123", patrimonio.getNumeroTombo());
    }

    @Test
    public void testGetDescricao() {
        Patrimonio patrimonio = new Patrimonio("PT123", "Descrição do Patrimônio", "Bom estado", new Date(), null, null);
        assertEquals("Descrição do Patrimônio", patrimonio.getDescricao());
    }

    @Test
    public void testGetEstado() {
        Patrimonio patrimonio = new Patrimonio("PT123", "Descrição do Patrimônio", "Bom estado", new Date(), null, null);
        assertEquals("Bom estado", patrimonio.getEstado());
    }

    @Test
    public void testGetDataAquisicao() {
        Date data = new Date();
        Patrimonio patrimonio = new Patrimonio("PT123", "Descrição do Patrimônio", "Bom estado", data, null, null);
        assertEquals(data, patrimonio.getDataAquisicao());
    }

    @Test
    public void testGetSala() {
        Sala sala = new Sala(101, 1, null);
        Patrimonio patrimonio = new Patrimonio("PT123", "Descrição do Patrimônio", "Bom estado", new Date(), null, sala);
        assertEquals(sala, patrimonio.getSala());
    }
}
