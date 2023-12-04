package main.view;

import main.controller.SalaController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LogadoView {
    public static void MenuLogado(String email){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vinde");
        System.out.println("Escolha uma opção: ");
        System.out.println("0- Sair");
        System.out.println("1- Ver relatório");
        System.out.println("2- Registrar Sala");
        System.out.println("3- Registrar patrimônio");
        System.out.println("4- Remover patrimônio");
        System.out.println("5- Movimentar patrimônio");
        System.out.println("6- Solicitar manutenção");

        try{
            int opcao  = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("rela");
                    break;
                case 2:
                    SalaController salaController = new SalaController();
                    SalaView salaView = new SalaView(salaController);
                    salaView.CriarSala(email);
                    break;
                case 3:
                    System.out.println("rela");
                    break;
                default:
                    System.out.println(3);
                    break;
            }
        }catch (InputMismatchException e){
            System.out.println("Opção inválida");
            MenuLogado(email);
        }
        scanner.close();
    }
}
