package main.view;

import main.controller.PatrimonioController;
import main.entity.Patrimonio;
import main.services.BuscarInstituicao;
import main.services.BuscarSala;

import java.util.Scanner;
import java.util.SortedMap;

public class AddPatrimonioView {

    private PatrimonioController patrimonioController;
    private Patrimonio patrimonio;

    public AddPatrimonioView(PatrimonioController patrimonioController){
        this.patrimonioController = patrimonioController;
    }

    public void AddPatrimonio(String email){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do tombo: ");
        String tombo = sc.next();
        System.out.println("Digite a descrição: ");
        String descricao = sc.next();
        System.out.println("Digite o estado do objeto: ");
        String estado = sc.next();
        System.out.println("Digite a data da aquisição: ");
        String dataAquisicao = sc.next();
        System.out.println("Digite o número da sala: ");
        String numSala = sc.next();
        System.out.println("Digite a unidade da sala: ");
        String unidadeSala = sc.next();
        patrimonioController.addPatrimonio(tombo, descricao, estado, dataAquisicao, email, numSala, unidadeSala);
        sc.close();
    }

}
