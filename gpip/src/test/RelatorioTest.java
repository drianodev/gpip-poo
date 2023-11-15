package test;

import static org.junit.Assert.*;

import main.model.Patrimonio;
import main.model.Relatorio;
import org.junit.Test;
import java.util.Date;

public class RelatorioTest {

    @Test
    public void testGerarRelatorio() {
        Patrimonio patrimonio = new Patrimonio(1, "PT123", "Descrição do Patrimônio 1", "Bom estado", new Date(), null, null);
        Relatorio relatorio = new Relatorio(1, "Criterio1", new Date(), patrimonio);

        // Gerar o relatório
        relatorio.gerarRelatorio();

        // Verificar se o relatório foi adicionado corretamente
        assertTrue(Relatorio.listarRelatorios().contains(relatorio));
    }

    @Test
    public void testListarRelatorios() {
        Patrimonio patrimonio1 = new Patrimonio(1, "PT123", "Descrição do Patrimônio 1", "Bom estado", new Date(), null, null);
        Relatorio relatorio1 = new Relatorio(1, "Criterio1", new Date(), patrimonio1);

        Patrimonio patrimonio2 = new Patrimonio(2, "PT456", "Descrição do Patrimônio 2", "Ótimo estado", new Date(), null, null);
        Relatorio relatorio2 = new Relatorio(2, "Criterio2", new Date(), patrimonio2);

        // Verificar se os relatórios foram adicionados corretamente
        assertTrue(Relatorio.listarRelatorios().contains(relatorio1));
        assertTrue(Relatorio.listarRelatorios().contains(relatorio2));
    }
}
