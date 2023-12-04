package main.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class loginService {
    public static String verificarCredenciais(String caminhoArquivo, String email, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length >= 2) {
                    String emailNoArquivo = partes[1].trim();
                    String senhaNoArquivo = partes[2].trim();

                    if (emailNoArquivo.equals(email)) {
                        if (senhaNoArquivo.equals(password)) {
                            if(partes.length == 5){
                                return "Admin";
                            }
                            return "Login";
                        } else {
                            return "Senha incorreta";
                        }
                    }
                }
            }
            return "Email não cadastrado";
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return "Erro na leitura do arquivo";
        }
    }

}
