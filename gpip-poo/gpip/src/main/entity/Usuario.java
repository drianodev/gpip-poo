package main.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Usuario {

    private UUID id;
    private String email;
    private String nome;
    private String senha;

    private static Map<String, Usuario> usuariosCadastrados = new HashMap<>();

    public Usuario(String email, String nome, String senha) {
        this.id = UUID.randomUUID();
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

    public static boolean cadastrar(String email, String nome, String senha) {
        if (usuariosCadastrados.containsKey(email)) {
            return false;
        }

        Usuario novoUsuario = new Usuario(email, nome, senha);
        usuariosCadastrados.put(email, novoUsuario);
        return true;
    }

    public static boolean fazerLogin(String email, String senha) {
        Usuario usuario = usuariosCadastrados.get(email);
        return usuario != null && usuario.getSenha().equals(senha);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static Map<String, Usuario> getUsuariosCadastrados() {
        return usuariosCadastrados;
    }

    public static void setUsuariosCadastrados(Map<String, Usuario> usuariosCadastrados) {
        Usuario.usuariosCadastrados = usuariosCadastrados;
    }
}
