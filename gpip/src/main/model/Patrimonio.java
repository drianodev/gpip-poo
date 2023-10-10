package main.model;

public class Patrimonio {

    private int id;
    private String numeroTombo;
    private String descricao;
    private String estado;
    private String localizacao;

    public Patrimonio(int id, String numeroTombo, String descricao, String estado, String localizacao) {
        this.id = id;
        this.numeroTombo = numeroTombo;
        this.descricao = descricao;
        this.estado = estado;
        this.localizacao = localizacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroTombo() {
        return numeroTombo;
    }

    public void setNumeroTombo(String numeroTombo) {
        this.numeroTombo = numeroTombo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
