package main.model;

import main.entity.Localizacao;

import java.io.*;

public class InstituicaoModel {
    public void InstituicaoModel(String nome, Localizacao localizacao){
        String arquivo = "gpip/database/instituicaoDatabase.txt";
        int contador = 1;
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo));
             BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(",");
                    String localizacaoArquivo = partes[2].trim();
                    if (localizacaoArquivo.equals(localizacao)) { // Aqui tem que comparar a string Localizacao no arquivo
                        //com um objeto do tipo localizacao, isso vai dar erro, tem que ver se converte o objeto localizacao pra string antes ou algo do tipo
                        System.out.println("retorna q instituicao existe");
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
