package main;

import main.model.Usuario;

public class Main {
    public static void main(String[] args) {
        // Testando o cadastro de usuários
        System.out.println("### Testando Cadastro de Usuários ###");
        testarCadastroDeUsuarios();

        // Testando o login de usuários
        System.out.println("\n### Testando Login de Usuários ###");
        testarLoginDeUsuarios();
    }

    private static void testarCadastroDeUsuarios() {

        // Tentar cadastrar usuários
        Usuario.cadastrar(1, "alexsandro@example.com", "ALexsandro Martins", "senha123");
        Usuario.cadastrar(2, "rogerio@example.com", "Rogério Pio", "senha456");
        Usuario.cadastrar(3, "teste@example.com", "Pedro Alencar", "senha789");

        // Exibir usuários cadastrados
        System.out.println("Usuários cadastrados:");
        Usuario.getUsuariosCadastrados().values().forEach(usuario -> System.out.println(usuario.getEmail()));
    }

    private static void testarLoginDeUsuarios() {
        // Tentar fazer login com credenciais corretas e incorretas
        System.out.println("Fazer login com credenciais corretas:");
        boolean loginCorreto1 = Usuario.fazerLogin("usuario1@example.com", "senha123");
        System.out.println("Login correto 1: " + loginCorreto1);

        boolean loginCorreto2 = Usuario.fazerLogin("usuario2@example.com", "senha456");
        System.out.println("Login correto 2: " + loginCorreto2);

        System.out.println("\nFazer login com credenciais incorretas:");
        boolean loginIncorreto1 = Usuario.fazerLogin("usuario1@example.com", "senha456");
        System.out.println("Login incorreto 1: " + loginIncorreto1);

        boolean loginIncorreto2 = Usuario.fazerLogin("usuario3@example.com", "senha789");
        System.out.println("Login incorreto 2: " + loginIncorreto2);

    }
}