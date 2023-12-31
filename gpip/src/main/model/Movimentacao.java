package main.model;

import java.util.Date;

public class Movimentacao {

    private long id;
    private Date dataMovimentacao;
    private Usuario responsavel;
    private Patrimonio patrimonio;
    private String tipoMovimentacao;

    public Movimentacao(long id, Date dataMovimentacao, Usuario responsavel, Patrimonio patrimonio, String tipoMovimentacao) {
        this.id = id;
        this.dataMovimentacao = dataMovimentacao;
        this.responsavel = responsavel;
        this.patrimonio = patrimonio;
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(Date dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public Patrimonio getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Patrimonio patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }
}
