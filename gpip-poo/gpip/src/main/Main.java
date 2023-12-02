package main;

import main.controller.CadastroController;
import main.controller.InstituicaoController;
import main.controller.LoginController;
import main.view.CadastroView;
import main.view.InstituicaoView;
import main.view.LoginView;

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste Cadastro");
        LoginController loginController = new LoginController();
        LoginView loginView = new LoginView(loginController);
        loginView.Login();
    }
}