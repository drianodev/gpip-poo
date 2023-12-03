package ufc.poo.controller;

import ufc.poo.model.entity.Sala;
import ufc.poo.repository.SalaRepository;

import java.util.List;
import java.util.UUID;

public class SalaController {

    private final SalaRepository salaRepository;

    public SalaController(SalaRepository salaRepository) {
        this.salaRepository = salaRepository;
    }

    public void salvarSala(Sala sala) {
        salaRepository.salvarSala(sala);
    }

    public Sala buscarSalaPorId(UUID id) {
        return salaRepository.buscarPorId(id);
    }

    public List<Sala> listarTodasSalas() {
        return salaRepository.listarTodas();
    }

    public void fecharConexao() {
        salaRepository.fecharConexao();
    }
}
