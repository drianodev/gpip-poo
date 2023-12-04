package main.controller;

import main.entity.Patrimonio;
import main.entity.Relatorio;
import main.model.RelatorioModel;
import main.view.LogadoView;

import java.util.List;

public class RelatorioController {
    private RelatorioController relatorioController;
    private Relatorio relatorio;
    public RelatorioController(){}

    public void gerarRelatorio(String email){
        RelatorioModel relatorioModel = new RelatorioModel();
        List<Patrimonio> listaPatrimonios = relatorioModel.gerarRelatorio(email);
        if(!listaPatrimonios.isEmpty()){
            for(Patrimonio patrimonio : listaPatrimonios){
                System.out.println(patrimonio.getPatrimonioCompleto(patrimonio));
            }
        }else{
            System.out.println("Não existem patrimônios");
        }
        LogadoView.MenuLogado(email);
    }
}
