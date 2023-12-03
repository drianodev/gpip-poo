package main.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Usuario {

    private long id;
    private String email;
    private String nome;
    private String senha;

    private static Map<String, Usuario> usuariosCadastrados = new HashMap<>();
    private static final String DATABASE_FILE = "userDatabase.txt";

    public Usuario(long id, String email, String nome, String senha) {
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

    public static boolean cadastrar(long id, String email, String nome, String senha) {
        
        if (usuariosCadastrados.containsKey(email)) {
            return false;
        }

        Usuario novoUsuario = new Usuario(id, email, nome, senha);
        usuariosCadastrados.put(email, novoUsuario);
        userSalveArquivo(novoUsuario);
        return true;
    }

    public static boolean fazerLogin(String email, String senha) {
        Usuario usuario = usuariosCadastrados.get(email);
        return usuario != null && usuario.getSenha().equals(senha);
    }

    private static void userSalveArquivo(Usuario usuario) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(DATABASE_FILE, true))) {
            String linha = String.format("%d;%s;%s;%s%n", usuario.getId(), usuario.getEmail(), usuario.getNome(), usuario.getSenha());
            writer.write(linha);
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
