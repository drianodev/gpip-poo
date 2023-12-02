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
        String email, password;
        System.out.println("Digite seu e-mail: ");
        email = scanner.next();
        System.out.println("Digite sua senha: ");
        password = scanner.next();
        System.out.println(loginController.Login(email, password));
        scanner.close();
    }
}
