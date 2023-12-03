package main.model;

import java.io.*;

public class CadastroModel {
    public CadastroModel() {
    }
    public static boolean CadastrarUsuario(String email, String password, String name) {
        String arquivo = "gpip/database/userDatabase.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo));
             BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length >= 2) {
                    String emailNoArquivo = partes[0].trim();
                    if (emailNoArquivo.equals(email)) {
                        return false;
                    }
                }
            }
            String novoUsuario = email + "," + password + "," + name;
            writer.write(novoUsuario);
            writer.newLine();
            return true;
        } catch (IOException e) {
            System.err.println("Erro ao ler ou escrever no arquivo: " + e.getMessage());
            return false;
        }
    }
}
