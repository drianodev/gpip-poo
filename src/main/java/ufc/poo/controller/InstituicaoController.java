package ufc.poo.controller;

import ufc.poo.model.entity.Instituicao;
import ufc.poo.repository.InstituicaoRepository;

import java.util.List;
import java.util.UUID;

public class InstituicaoController {

    private final InstituicaoRepository instituicaoRepository;

    public InstituicaoController(InstituicaoRepository instituicaoRepository) {
        this.instituicaoRepository = instituicaoRepository;
    }

    public void salvarInstituicao(Instituicao instituicao) {
        instituicaoRepository.salvarInstituicao(instituicao);
    }

    public Instituicao buscarInstituicaoPorId(UUID id) {
        return instituicaoRepository.buscarPorId(id);
    }

    public List<Instituicao> listarTodasInstituicoes() {
        return instituicaoRepository.listarTodas();
    }

    public void fecharConexao() {
        instituicaoRepository.fecharConexao();
    }
}
