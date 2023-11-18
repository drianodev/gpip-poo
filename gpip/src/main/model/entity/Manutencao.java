package main.model.entity;

import java.util.Date;
import java.util.UUID;

public class Manutencao {

    private UUID id;
    private Date data;
    private String tipoManutencao;
    private String descricao;
    private Patrimonio patrimonio;

    public Manutencao(Date data, String tipoManutencao, String descricao, Patrimonio patrimonio) {
        this.id = UUID.randomUUID();
        this.data = data;
        this.tipoManutencao = tipoManutencao;
        this.descricao = descricao;
        this.patrimonio = patrimonio;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
