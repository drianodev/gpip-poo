package test;

import static org.junit.Assert.*;

import main.model.entity.Patrimonio;
import main.model.entity.Relatorio;
import org.junit.Test;
import java.util.Date;

public class RelatorioTest {

    @Test
    public void testGerarRelatorio() {
        Patrimonio patrimonio = new Patrimonio("PT123", "Descrição do Patrimônio 1", "Bom estado", new Date(), null, null);
        Relatorio relatorio = new Relatorio("Criterio1", new Date(), patrimonio);

        // Gerar o relatório
        relatorio.gerarRelatorio();

        // Verificar se o relatório foi adicionado corretamente
        assertTrue(Relatorio.listarRelatorios().contains(relatorio));
    }

    @Test
    public void testListarRelatorios() {
        Patrimonio patrimonio1 = new Patrimonio("PT123", "Descrição do Patrimônio 1", "Bom estado", new Date(), null, null);
        Relatorio relatorio1 = new Relatorio("Criterio1", new Date(), patrimonio1);

        Patrimonio patrimonio2 = new Patrimonio("PT456", "Descrição do Patrimônio 2", "Ótimo estado", new Date(), null, null);
        Relatorio relatorio2 = new Relatorio("Criterio2", new Date(), patrimonio2);

        // Verificar se os relatórios foram adicionados corretamente
        assertTrue(Relatorio.listarRelatorios().contains(relatorio1));
        assertTrue(Relatorio.listarRelatorios().contains(relatorio2));
    }
}
