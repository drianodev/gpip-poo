package main.model;

import java.util.Date;

public class Patrimonio {

   private long id;
   private String numeroTombo;
   private String descricao;
   private String estado;
   private Date dataAquisicao;
   private Instituicao instituicao;
   private Sala sala;

    public Patrimonio(long id, String numeroTombo, String descricao, String estado,
                      Date dataAquisicao, Instituicao instituicao, Sala sala) {
        this.id = id;
        this.numeroTombo = numeroTombo;
        this.descricao = descricao;
        this.estado = estado;
        this.dataAquisicao = dataAquisicao;
        this.instituicao = instituicao;
        this.sala = sala;
    }

    public Patrimonio(long id, String numeroTombo, String descricao, String estado,
                      Date dataAquisicao, Instituicao instituicao) {
        this.id = id;
        this.numeroTombo = numeroTombo;
        this.descricao = descricao;
        this.estado = estado;
        this.dataAquisicao = dataAquisicao;
        this.instituicao = instituicao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
