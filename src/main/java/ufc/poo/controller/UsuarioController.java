package ufc.poo.controller;

import ufc.poo.model.entity.Usuario;
import ufc.poo.repository.UsuarioRepository;

import java.util.List;
import java.util.UUID;

public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    public boolean logarUsuario(String email, String senha) {
        return Usuario.fazerLogin(email, senha);
    }

    public void salvarUsuario(Usuario usuario) {
        usuarioRepository.salvarUsuario(usuario);
    }

    public Usuario buscarUsuarioPorId(UUID id) {
        return usuarioRepository.buscarPorId(id);
    }

    public List<Usuario> listarTodosUsuarios() {
        return usuarioRepository.listarTodas();
    }

    public void fecharConexao() {
        usuarioRepository.fecharConexao();
    }
}
