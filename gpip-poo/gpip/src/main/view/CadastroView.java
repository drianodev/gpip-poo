package main.view;

import main.controller.CadastroController;

import java.util.Scanner;

public class CadastroView {
    private CadastroController cadastroController;

    public CadastroView(CadastroController cadastroController){
        this.cadastroController = cadastroController;
    }

    public void CadastrarUsuario(){
        Scanner scanner = new Scanner(System.in);
        String email, name, password;
        System.out.println("Digite seu email: ");
        email = scanner.nextLine();
        System.out.println("Digite seu nome e sobrenome: ");
        name = scanner.nextLine();
        System.out.println("Digite sua senha: ");
        password = scanner.nextLine();
        cadastroController.CadastrarUsuario(email, name, password);
        scanner.close();
    }
}
