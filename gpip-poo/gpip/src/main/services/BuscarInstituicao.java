package main.services;

import java.io.*;

public class BuscarInstituicao {

    public String buscarInstituicaoByEmail(String email){
        try (BufferedReader reader = new BufferedReader(new FileReader("gpip/database/userDatabase.txt"));){
            String linha;
            while ((linha = reader.readLine()) != null) {
                String [] partes = linha.split(",");
                if(email.equals(partes[1])){
                    return partes[4];
                }
            }
        }catch (IOException e){
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return "Nada";
    }
}
