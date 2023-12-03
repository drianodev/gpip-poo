package ufc.poo.controller;

import ufc.poo.model.entity.Movimentacao;
import ufc.poo.repository.MovimentacaoRepository;

import java.util.List;
import java.util.UUID;

public class MovimentacaoController {

    private final MovimentacaoRepository movimentacaoRepository;

    public MovimentacaoController(MovimentacaoRepository movimentacaoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
    }

    public void salvarMovimentacao(Movimentacao movimentacao) {
        movimentacaoRepository.salvarMovimentacao(movimentacao);
    }

    public Movimentacao buscarMovimentacaoPorId(UUID id) {
        return movimentacaoRepository.buscarPorId(id);
    }

    public List<Movimentacao> listarTodasMovimentacoes() {
        return movimentacaoRepository.listarTodas();
    }

    public void fecharConexao() {
        movimentacaoRepository.fecharConexao();
    }
}
