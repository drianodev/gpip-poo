package test;

import static org.junit.Assert.*;

import main.model.Manutencao;
import main.model.Patrimonio;
import org.junit.Test;
import java.util.Date;

public class ManutencaoTest {

    @Test
    public void testConstrutorEGetters() {
        Patrimonio patrimonio = new Patrimonio(1, "PT123", "Descrição do patrimônio", "Bom estado", new Date(), null, null);
        Date data = new Date();  // Simulando a data atual
        Manutencao manutencao = new Manutencao(1, data, "Preventiva", "Descrição da manutenção", patrimonio);

        assertEquals(1, manutencao.getId());
        assertEquals(data, manutencao.getData());
        assertEquals("Preventiva", manutencao.getTipoManutencao());
        assertEquals("Descrição da manutenção", manutencao.getDescricao());
        assertEquals(patrimonio, manutencao.getPatrimonio());
    }

    @Test
    public void testSetters() {
        Manutencao manutencao = new Manutencao(1, new Date(), "Corretiva", "Descrição inicial", null);

        Date novaData = new Date();
        manutencao.setData(novaData);
        assertEquals(novaData, manutencao.getData());

        manutencao.setTipoManutencao("Preventiva");
        assertEquals("Preventiva", manutencao.getTipoManutencao());

        manutencao.setDescricao("Nova descrição");
        assertEquals("Nova descrição", manutencao.getDescricao());

        Patrimonio novoPatrimonio = new Patrimonio(2, "PT456", "Novo patrimônio", "Ótimo estado", new Date(), null, null);
        manutencao.setPatrimonio(novoPatrimonio);
        assertEquals(novoPatrimonio, manutencao.getPatrimonio());
    }
}
