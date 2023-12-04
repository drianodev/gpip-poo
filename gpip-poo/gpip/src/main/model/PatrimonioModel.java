package main.model;

import main.entity.Patrimonio;
import main.services.BuscarPatrimonio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PatrimonioModel {

    public void adicionarPatrimonio(Patrimonio patrimonio) {
        BuscarPatrimonio buscarPatrimonio = new BuscarPatrimonio();
        if (!buscarPatrimonio.buscarPatrimonio(patrimonio)) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("gpip/database/patrimonioDatabase.txt", true))) {
                writer.write(patrimonio.getPatrimonioCompleto(patrimonio));
                writer.newLine();
                System.out.println("Patrimônio adicionado");
            } catch (IOException e) {
                System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        }
    }

    public void removerPatrimonio(Patrimonio patrimonio) {
        BuscarPatrimonio buscarPatrimonio = new BuscarPatrimonio();
        if (buscarPatrimonio.buscarPatrimonio(patrimonio)) {
            List<String> linhas = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader("gpip/database/patrimonioDatabase.txt"))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    if (!linha.equals(patrimonio.getPatrimonioCompleto(patrimonio))) {
                        linhas.add(linha);
                    }
                }
            } catch (IOException e) {
                System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            }
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("gpip/database/patrimonioDatabase.txt"))) {
                for (String linha : linhas) {
                    writer.write(linha);
                    writer.newLine();
                }
            } catch (IOException e) {
                System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
            }
        }
    }
}
