package test;

import main.model.Movimentacao;
import main.model.Patrimonio;
import main.model.Usuario;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class MovimentacaoTest {

    @Test
    public void testGetId() {
        Movimentacao movimentacao = new Movimentacao(1, new Date(), null, null, "Entrada");
        assertEquals(1, movimentacao.getId());
    }

    @Test
    public void testGetDataMovimentacao() {
        Date data = new Date();
        Movimentacao movimentacao = new Movimentacao(1, data, null, null, "Saída");
        assertEquals(data, movimentacao.getDataMovimentacao());
    }

    @Test
    public void testGetResponsavel() {
        Usuario responsavel = new Usuario(1, "responsavel@example.com", "Responsavel", "senha123");
        Movimentacao movimentacao = new Movimentacao(1, new Date(), responsavel, null, "Entrada");
        assertEquals(responsavel, movimentacao.getResponsavel());
    }

    @Test
    public void testGetPatrimonio() {
        Patrimonio patrimonio = new Patrimonio(1, "PT123", "Descrição do Patrimônio", "Bom estado", new Date(), null, null);
        Movimentacao movimentacao = new Movimentacao(1, new Date(), null, patrimonio, "Saída");
        assertEquals(patrimonio, movimentacao.getPatrimonio());
    }

    @Test
    public void testGetTipoMovimentacao() {
        Movimentacao movimentacao = new Movimentacao(1, new Date(), null, null, "Entrada");
        assertEquals("Entrada", movimentacao.getTipoMovimentacao());
    }

    @Test
    public void testSetTipoMovimentacao() {
        Movimentacao movimentacao = new Movimentacao(1, new Date(), null, null, "Saída");
        movimentacao.setTipoMovimentacao("Transferência");
        assertEquals("Transferência", movimentacao.getTipoMovimentacao());
    }
}
