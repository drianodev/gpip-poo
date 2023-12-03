package ufc.poo.controller;

import ufc.poo.model.entity.Manutencao;
import ufc.poo.repository.ManutencaoRepository;

import java.util.List;
import java.util.UUID;

public class ManutencaoController {

    private final ManutencaoRepository manutencaoRepository;

    public ManutencaoController(ManutencaoRepository manutencaoRepository) {
        this.manutencaoRepository = manutencaoRepository;
    }

    public void salvarManutencao(Manutencao manutencao) {
        manutencaoRepository.salvarManutencao(manutencao);
    }

    public Manutencao buscarManutencaoPorId(UUID id) {
        return manutencaoRepository.buscarPorId(id);
    }

    public List<Manutencao> listarTodasManutencoes() {
        return manutencaoRepository.listarTodas();
    }

    public void fecharConexao() {
        manutencaoRepository.fecharConexao();
    }
}
