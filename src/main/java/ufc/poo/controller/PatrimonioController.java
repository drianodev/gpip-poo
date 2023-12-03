package ufc.poo.controller;

import ufc.poo.model.entity.Patrimonio;
import ufc.poo.repository.PatrimonioRepository;

import java.util.List;
import java.util.UUID;

public class PatrimonioController {

    private final PatrimonioRepository patrimonioRepository;

    public PatrimonioController(PatrimonioRepository patrimonioRepository) {
        this.patrimonioRepository = patrimonioRepository;
    }

    public void salvarPatrimonio(Patrimonio patrimonio) {
        patrimonioRepository.salvarPatrimonio(patrimonio);
    }

    public Patrimonio buscarPatrimonioPorId(UUID id) {
        return patrimonioRepository.buscarPorId(id);
    }

    public List<Patrimonio> listarTodosPatrimonios() {
        return patrimonioRepository.listarTodos();
    }

    public void fecharConexao() {
        patrimonioRepository.fecharConexao();
    }
}
