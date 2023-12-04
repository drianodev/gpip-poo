package main.model;

import main.entity.Localizacao;

import java.io.*;

public class InstituicaoModel {
    public InstituicaoModel(String nome, Localizacao localizacao) {
        String arquivo = "gpip/database/instituicaoDatabase.txt";
        int contador = 1;
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo));
             BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(",");
                String localizacaoArquivo = partes[2].trim();
                if (localizacaoArquivo.equals(localizacao.toString())) {
                    System.out.println("Instituicao já existe");
                }
                contador++;
            }

            String novaInstituicao = contador + "," + nome + "," + localizacao;
            writer.write(novaInstituicao);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao ler ou escrever no arquivo: " + e.getMessage());
        }
    }
}