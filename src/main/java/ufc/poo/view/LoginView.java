package ufc.poo.view;

import ufc.poo.controller.UsuarioController;
import ufc.poo.model.entity.Usuario;

import java.util.Scanner;

public class LoginView {

    private final UsuarioController usuarioController;

    public LoginView(UsuarioController usuarioController) {
        this.usuarioController = usuarioController;
    }

    public void exibirMenuLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo! Por favor, faça login:");

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if (usuarioController.logarUsuario(email, senha)) {
            System.out.println("Login bem-sucedido!");
            // Aqui você pode prosseguir com as operações após o login, se necessário.
        } else {
            System.out.println("Falha no login. Verifique suas credenciais.");
        }

        // Feche o scanner
        scanner.close();
    }
}