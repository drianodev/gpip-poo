package main.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Servidor {

    private UUID id;
    private String cargo;
    private Usuario usuario;
    private Instituicao instituicao;
    private List<Patrimonio> patrimonios;


    public Servidor(String cargo, Usuario usuario, Instituicao instituicao) {
        this.id = UUID.randomUUID();
        this.cargo = cargo;
        this.usuario = usuario;
        this.patrimonios = new ArrayList<>();
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

    public void solicitarManutencao(Patrimonio patrimonio, String descricao, Usuario responsavel) {
        Manutencao manutencao = new Manutencao(new Date(), "Tipo de Manutenção", descricao, patrimonio);
    }
}
