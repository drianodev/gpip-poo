package main.view;

import main.controller.InstituicaoController;
import main.entity.Localizacao;

import java.util.Scanner;

public class InstituicaoView {

    private InstituicaoController controller;

    public InstituicaoView(InstituicaoController controller) {
        this.controller = controller;
    }

    public void cadastroInstituicao(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vinde");
        System.out.print("Digite o nome da instituição: ");
        String nome = scanner.nextLine();
        System.out.print(""); // Fazer localizacao
        Localizacao localizacao = new Localizacao("1", "1", "1", "1", "1", "1");
        System.out.println(localizacao);
        InstituicaoController.CadastrarInstituicao(nome, localizacao);
        scanner.close();
    }
}
