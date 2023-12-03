package ufc.poo.model.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "servidores")
public class Servidor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "cargo_servidor", nullable = false, length = 80)
    private String cargo;

    @OneToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name = "instituicao_id", nullable = false)
    private Instituicao instituicao;

    @OneToMany
    @JoinColumn(name = "patrimonio_id")
    private List<Patrimonio> patrimonios;


    public Servidor(String cargo, Usuario usuario, Instituicao instituicao) {
        this.cargo = cargo;
        this.usuario = usuario;
        this.patrimonios = new ArrayList<>();
    }

    public Servidor() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public void adicionarPatrimonio(Patrimonio patrimonio) {
        this.patrimonios.add(patrimonio);
    }

    public void removerPatrimonio(Patrimonio patrimonio) {
        this.patrimonios.remove(patrimonio);
    }

    public void movimentarPatrimonio(Patrimonio patrimonio, Sala salaDestino, Usuario responsavel) {
        patrimonio.setSala(salaDestino);
    }

//    public void solicitarManutencao(Patrimonio patrimonio, String descricao, Usuario responsavel) {
//        Manutencao manutencao = new Manutencao(new Date(), "Tipo de Manutenção", descricao, patrimonio);
//    }
}
