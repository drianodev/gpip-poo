package ufc.poo.controller;

import ufc.poo.model.entity.Relatorio;
import ufc.poo.repository.RelatorioRepository;

import java.util.List;
import java.util.UUID;

public class RelatorioController {

    private final RelatorioRepository relatorioRepository;

    public RelatorioController(RelatorioRepository relatorioRepository) {
        this.relatorioRepository = relatorioRepository;
    }

    public void salvarRelatorio(Relatorio relatorio) {
        relatorioRepository.salvarRelatorio(relatorio);
    }

    public Relatorio buscarRelatorioPorId(UUID id) {
        return relatorioRepository.buscarPorId(id);
    }

    public List<Relatorio> listarTodosRelatorios() {
        return relatorioRepository.listarTodos();
    }

    public void fecharConexao() {
        relatorioRepository.fecharConexao();
    }
}
