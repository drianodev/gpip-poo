package test;

import main.model.entity.Movimentacao;
import main.model.entity.Patrimonio;
import main.model.entity.Usuario;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class MovimentacaoTest {

    @Test
    public void testGetId() {
        Movimentacao movimentacao = new Movimentacao(new Date(), null, null, "Entrada");
        assertEquals(1, movimentacao.getId());
    }

    @Test
    public void testGetDataMovimentacao() {
        Date data = new Date();
        Movimentacao movimentacao = new Movimentacao(data, null, null, "Saída");
        assertEquals(data, movimentacao.getDataMovimentacao());
    }

    @Test
    public void testGetResponsavel() {
        Usuario responsavel = new Usuario("responsavel@example.com", "Responsavel", "senha123");
        Movimentacao movimentacao = new Movimentacao(new Date(), responsavel, null, "Entrada");
        assertEquals(responsavel, movimentacao.getResponsavel());
    }

    @Test
    public void testGetPatrimonio() {
        Patrimonio patrimonio = new Patrimonio("PT123", "Descrição do Patrimônio", "Bom estado", new Date(), null, null);
        Movimentacao movimentacao = new Movimentacao(new Date(), null, patrimonio, "Saída");
        assertEquals(patrimonio, movimentacao.getPatrimonio());
    }

    @Test
    public void testGetTipoMovimentacao() {
        Movimentacao movimentacao = new Movimentacao(new Date(), null, null, "Entrada");
        assertEquals("Entrada", movimentacao.getTipoMovimentacao());
    }

    @Test
    public void testSetTipoMovimentacao() {
        Movimentacao movimentacao = new Movimentacao(new Date(), null, null, "Saída");
        movimentacao.setTipoMovimentacao("Transferência");
        assertEquals("Transferência", movimentacao.getTipoMovimentacao());
    }
}
