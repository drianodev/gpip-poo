package main.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Relatorio {

    private UUID id;
    private String criterio;
    private Date dataGeracao;
    private Patrimonio patrimonio;

    private static List<Relatorio> relatorios = new ArrayList<>();

    public Relatorio(String criterio, Date dataGeracao, Patrimonio patrimonio) {
        this.id = UUID.randomUUID();
        this.criterio = criterio;
        this.dataGeracao = dataGeracao;
        this.patrimonio = patrimonio;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCriterio() {
        return criterio;
    }

    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }

    public Date getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public Patrimonio getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Patrimonio patrimonio) {
        this.patrimonio = patrimonio;
    }

    public static List<Relatorio> listarRelatorios() {
        return relatorios;
    }

    public void gerarRelatorio() {
        relatorios.add(this);
    }
}
