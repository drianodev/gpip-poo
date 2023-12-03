package ufc.poo.controller;

import ufc.poo.model.entity.Servidor;
import ufc.poo.repository.ServidorRepository;

import java.util.List;
import java.util.UUID;

public class ServidorController {

    private final ServidorRepository servidorRepository;

    public ServidorController(ServidorRepository servidorRepository) {
        this.servidorRepository = servidorRepository;
    }

    public void salvarServidor(Servidor servidor) {
        servidorRepository.salvarServidor(servidor);
    }

    public Servidor buscarServidorPorId(UUID id) {
        return servidorRepository.buscarPorId(id);
    }

    public List<Servidor> listarTodosServidores() {
        return servidorRepository.listarTodos();
    }

    public void fecharConexao() {
        servidorRepository.fecharConexao();
    }
}
