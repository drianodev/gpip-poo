package main.model;

public class Sala {

    private long id;
    private int unidade;
    private int numeroDaSala;
    private Instituicao instituicao;

    public Sala(long id, int unidade, int numeroDaSala, Instituicao instituicao) {
        this.id = id;
        this.unidade = unidade;
        this.numeroDaSala = numeroDaSala;
        this.instituicao = instituicao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
