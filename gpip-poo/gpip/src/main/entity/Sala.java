package main.entity;

import java.util.UUID;

public class Sala {

    private UUID id;
    private int unidade;
    private int numeroDaSala;
    private Instituicao instituicao;

    public Sala(int unidade, int numeroDaSala, Instituicao instituicao) {
        this.id = UUID.randomUUID();
        this.unidade = unidade;
        this.numeroDaSala = numeroDaSala;
        this.instituicao = instituicao;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }
}
