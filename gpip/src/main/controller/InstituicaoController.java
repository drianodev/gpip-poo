package main.controller;

import main.model.entity.Instituicao;
import main.model.entity.Localizacao;
import main.model.entity.Usuario;

public class InstituicaoController {

    private Instituicao instituicao;

    public InstituicaoController() {
        this.instituicao = new Instituicao("Minha Instituicao",
                new Localizacao("rua a", "123", "bairro a", "cidade a", "ceara", "61616161"),
                new Usuario("admin@email.com", "admin", "senha"));
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void exibirDetalhesInstituicao() {
        // Aqui você pode chamar métodos do modelo para obter informações e passá-las para a view.
        System.out.println("Detalhes da Instituicao:");
        System.out.println("ID: " + instituicao.getId());
        System.out.println("Nome: " + instituicao.getNomeInstituicao());
        System.out.println("Localizacao: " + instituicao.getLocalizacao().toString());
        System.out.println("Usuario: " + instituicao.getUsuario().getNome());
    }
}
