package test;

import main.model.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ServidorTest {

    private Servidor servidor;
    private Patrimonio patrimonio;
    private Sala sala;

    @Before
    public void setUp() {
        Usuario usuario = new Usuario(1, "usuario@exemplo.com", "Usuário Exemplo", "senha");
        Instituicao instituicao = new Instituicao(1, "Instituição Exemplo", new Localizacao(1, "Rua A", "123", "Bairro1", "Cidade1", "Estado1", "12345-678"), usuario);
        servidor = new Servidor(1, "Cargo Exemplo", usuario, instituicao);
        patrimonio = new Patrimonio(1, "PT123", "Descrição do Patrimônio", "Bom estado", new Date(), null, null);
        sala = new Sala(1, 1, 101, instituicao);
    }

    @Test
    public void testMovimentarPatrimonio() {
        servidor.adicionarPatrimonio(patrimonio);
        servidor.movimentarPatrimonio(patrimonio, sala, servidor.getUsuario());
        assertEquals(sala, patrimonio.getSala());
    }
}
