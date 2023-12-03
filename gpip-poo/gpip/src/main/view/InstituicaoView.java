package main.view;

import main.controller.InstituicaoController;

public class InstituicaoView {

    private InstituicaoController controller;

    public InstituicaoView(InstituicaoController controller) {
        this.controller = controller;
    }

    public void exibirDetalhesInstituicao() {
        controller.exibirDetalhesInstituicao();
    }
}
