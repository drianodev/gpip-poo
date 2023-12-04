package main.entity;

import java.util.Date;
import java.util.UUID;

public class Movimentacao {

    private UUID id;
    private Date dataMovimentacao;
    private Usuario responsavel;
    private Patrimonio patrimonio;
    private String tipoMovimentacao;

    public Movimentacao(Date dataMovimentacao, Usuario responsavel, Patrimonio patrimonio, String tipoMovimentacao) {
        this.id = UUID.randomUUID();
        this.dataMovimentacao = dataMovimentacao;
        this.responsavel = responsavel;
        this.patrimonio = patrimonio;
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
        if (tipoMovimentacao != null && !tipoMovimentacao.trim().isEmpty()) {
            this.tipoMovimentacao = tipoMovimentacao.trim();
        } else {
            throw new IllegalArgumentException("Tipo de movimentação não pode ser nulo ou vazio");
        }
    }
}
