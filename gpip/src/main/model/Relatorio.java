package main.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Relatorio {

    private long id;
    private String criterio;
    private Date dataGeracao;
    private Patrimonio patrimonio;

    private static List<Relatorio> relatorios = new ArrayList<>();

    public Relatorio(long id, String criterio, Date dataGeracao, Patrimonio patrimonio) {
        this.id = id;
        this.criterio = criterio;
        this.dataGeracao = dataGeracao;
        this.patrimonio = patrimonio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
