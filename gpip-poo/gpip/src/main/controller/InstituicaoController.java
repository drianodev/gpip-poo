package main.controller;

import main.entity.Instituicao;
import main.entity.Localizacao;
import main.entity.Usuario;

public class InstituicaoController {

    private Instituicao instituicao;

    public InstituicaoController() {
       }

       public void cadastrarInstituicao(String nome, Localizacao localizacao) {
        InstituicaoModel instituicaoModel = new InstituicaoModel();
        if (!instituicaoModel.instituicaoExiste(localizacao)) {
            instituicaoModel.InstituicaoModel(nome, localizacao);
        } else {
            System.out.println("Instituição com a mesma localização já existe.");
        }
    }
}