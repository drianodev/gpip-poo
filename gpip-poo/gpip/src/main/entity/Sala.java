package main.entity;

import java.util.UUID;

public class Sala {

    private UUID id;
    private String unidade;
    private String numeroDaSala;
    private Instituicao instituicao;
    private String idInstituicao;

    public Sala(String numSala, String numUnidade, String id) {
        this.id = UUID.randomUUID();
        this.numeroDaSala = numSala;
        this.unidade = numUnidade;
        this.idInstituicao = id;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        if (unidade != null && !unidade.trim().isEmpty()) {
            this.unidade = unidade.trim();
        } else {
            throw new IllegalArgumentException("Unidade não pode ser nula ou vazia");
        }
    }

    public String getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(String numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }
}
