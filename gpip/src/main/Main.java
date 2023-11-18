package main;

import main.controller.InstituicaoController;
import main.view.InstituicaoView;

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste Instituição");
        InstituicaoController controller = new InstituicaoController();
        InstituicaoView view = new InstituicaoView(controller);
        view.exibirDetalhesInstituicao();
        //=============================================================
    }
}