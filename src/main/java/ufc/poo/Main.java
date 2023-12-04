package ufc.poo;

import ufc.poo.controller.UsuarioController;
import ufc.poo.model.entity.Usuario;
import ufc.poo.repository.UsuarioRepository;
import ufc.poo.view.LoginView;

public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("allan@mail.com", "allan","123");
        UsuarioRepository usuarioRepository = null;
        UsuarioController usuarioController = new UsuarioController(usuarioRepository);
        LoginView loginView = new LoginView(usuarioController);

        // Exiba o menu de login
        loginView.exibirMenuLogin();

        // Feche a conexão após o uso
        usuarioController.fecharConexao();
    }
}