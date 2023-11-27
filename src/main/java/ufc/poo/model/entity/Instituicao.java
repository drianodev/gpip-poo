package ufc.poo.model.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "instituicoes")
public class Instituicao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "nome_instituicao", nullable = false, length = 80)
    private String nomeInstituicao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "localizacao_id", nullable = false)
    private Localizacao localizacao;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public Instituicao(String nomeInstituicao, Localizacao localizacao, Usuario usuario) {
//        this.id = UUID.randomUUID();
        this.nomeInstituicao = nomeInstituicao;
        this.localizacao = localizacao;
        this.usuario = usuario;
    }

    public Instituicao() {
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
        this.nomeInstituicao = nomeInstituicao;
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
