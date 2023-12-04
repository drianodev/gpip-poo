package main.controller;

import main.entity.Patrimonio;
import main.model.PatrimonioModel;
import main.services.BuscarInstituicao;
import main.services.BuscarPatrimonio;
import main.services.BuscarSala;
import main.view.LogadoView;
import main.view.MenuView;

public class PatrimonioController {

    private Patrimonio patrimonio;
    public PatrimonioController(){}

    public void addPatrimonio(String tombo, String descricao, String estado, String dataAquisicao, String idInstituicao, String numSala, String unidadeSala){
        BuscarInstituicao buscarInstituicao = new BuscarInstituicao();
        BuscarSala buscarSala = new BuscarSala();
        String id = buscarInstituicao.buscarInstituicaoByEmail(idInstituicao);
        if(!buscarInstituicao.buscarInstituicaoByEmail(idInstituicao).equals("Nada") && buscarSala.buscarSala(numSala, unidadeSala, id) != null){
            patrimonio = new Patrimonio(tombo, descricao, estado, dataAquisicao, id, numSala, unidadeSala);
            PatrimonioModel patrimonioModel = new PatrimonioModel();
            patrimonioModel.adicionarPatrimonio(patrimonio);
        }else{
            System.out.println("Instituição ou sala não encontrada");
        }
    }

    public void removePatrimonio(String numeroTombo, String email){
        BuscarInstituicao buscarInstituicao = new BuscarInstituicao();
        BuscarPatrimonio buscarPatrimonio = new BuscarPatrimonio();
        patrimonio = buscarPatrimonio.buscarPatrimonioByTombo(numeroTombo, buscarInstituicao.buscarInstituicaoByEmail(email));
        if(patrimonio != null){
            PatrimonioModel patrimonioModel = new PatrimonioModel();
            patrimonioModel.removerPatrimonio(patrimonio);
        }else{
            System.out.println("Patrimonio não encontrado");
        }
        LogadoView.MenuLogado(email);

    }
}
