package main.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Servidor {

    private long id;
    private String cargo;
    private Usuario usuario;
    private Instituicao instituicao;
    private List<Patrimonio> patrimonios;


    public Servidor(long id, String cargo, Usuario usuario, Instituicao instituicao) {
        this.id = id;
        this.cargo = cargo;
        this.usuario = usuario;
        this.patrimonios = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
        Manutencao manutencao = new Manutencao(1, new Date(), "Tipo de Manutenção", descricao, patrimonio);
    }
}
