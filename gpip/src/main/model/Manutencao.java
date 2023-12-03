package main.model;

import java.util.Date;

public class Manutencao {

    private long id;
    private Date data;
    private String tipoManutencao;
    private String descricao;
    private Patrimonio patrimonio;

    public Manutencao(long id, Date data, String tipoManutencao, String descricao, Patrimonio patrimonio) {
        this.id = id;
        this.data = data;
        this.tipoManutencao = tipoManutencao;
        this.descricao = descricao;
        this.patrimonio = patrimonio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Patrimonio getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Patrimonio patrimonio) {
        this.patrimonio = patrimonio;
    }
}
