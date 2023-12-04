package main.controller;

import main.model.SalaModel;
import main.services.BuscarInstituicao;

public class SalaController {

    public SalaController(){}

    public static void CriarSala(int numSala, int numUnidade, String email){
        if(numSala != 0 && numUnidade != 0){
            SalaModel salaModel = new SalaModel();
            BuscarInstituicao buscarInstituicao = new BuscarInstituicao();
            if(!buscarInstituicao.buscarInstituicaoByEmail(email).equals("Nada")){
                salaModel.criarSala(numSala, numUnidade, buscarInstituicao.buscarInstituicaoByEmail(email));
            }
        }
    }
}
