package main;

import main.controller.CadastroController;
import main.controller.InstituicaoController;
import main.controller.LoginController;
import main.view.CadastroView;
import main.view.InstituicaoView;
import main.view.LoginView;

public class Main {
    public static void main(String[] args) {
        LoginController cadastroController = new LoginController();
        LoginView cadastroView = new LoginView(cadastroController);
        cadastroView.Login();
    }
}