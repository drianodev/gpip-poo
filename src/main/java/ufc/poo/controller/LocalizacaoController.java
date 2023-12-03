package ufc.poo.controller;

import ufc.poo.model.entity.Localizacao;
import ufc.poo.repository.LocalizacaoRepository;

import java.util.List;
import java.util.UUID;

public class LocalizacaoController {

    private final LocalizacaoRepository localizacaoRepository;

    public LocalizacaoController(LocalizacaoRepository localizacaoRepository) {
        this.localizacaoRepository = localizacaoRepository;
    }

    public void salvarLocalizacao(Localizacao localizacao) {
        localizacaoRepository.salvarLocalizacao(localizacao);
    }

    public Localizacao buscarLocalizacaoPorId(UUID id) {
        return localizacaoRepository.buscarPorId(id);
    }

    public List<Localizacao> listarTodasLocalizacoes() {
        return localizacaoRepository.listarTodas();
    }

    public void fecharConexao() {
        localizacaoRepository.fecharConexao();
    }
}
