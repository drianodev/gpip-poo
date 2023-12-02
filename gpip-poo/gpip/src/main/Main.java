package main;

import main.controller.CadastroController;
import main.controller.InstituicaoController;
import main.view.CadastroView;
import main.view.InstituicaoView;

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste Cadastro");
        CadastroController cadastroController = new CadastroController();
        CadastroView cadastroView = new CadastroView(cadastroController);
        cadastroView.CadastrarUsuario();
    }
}