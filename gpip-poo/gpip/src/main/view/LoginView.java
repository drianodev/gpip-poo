package main.view;

import main.controller.LoginController;

import java.util.Scanner;

public class LoginView {
    private LoginController loginController;

    public LoginView(LoginController loginController){
        this.loginController = loginController;
    }

    public void Login(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo! Por favor, faça login:");

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if (loginController.Login(email, senha).equals("Login")) {
            LogadoView.MenuLogado(email);
        }else if(loginController.Login(email, senha).equals("Admin")){
            AdminLogado.adminLogado();
        }else {
            System.out.println("Falha no login. Verifique suas credenciais.");
            MenuView.menu();
        }
        scanner.close();
    }
}
