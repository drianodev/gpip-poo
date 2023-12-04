package main.entity;

import java.util.UUID;

public class Instituicao {

    private UUID id;
    private String nomeInstituicao;
    private Localizacao localizacao;
    private Usuario usuario;

    public Instituicao(String nomeInstituicao, Localizacao localizacao, Usuario usuario) {
        this.id = UUID.randomUUID();
        this.nomeInstituicao = nomeInstituicao;
        this.localizacao = localizacao;
        this.usuario = usuario;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        if (nomeInstituicao != null && !nomeInstituicao.trim().isEmpty()) {
            this.nomeInstituicao = nomeInstituicao;
        } else {
            throw new IllegalArgumentException("Nome da instituição não pode ser nulo ou vazio");
        }
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
