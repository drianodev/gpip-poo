package main.services;

import main.entity.Patrimonio;
import main.entity.Sala;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuscarPatrimonio {
    public boolean buscarPatrimonio(Patrimonio patrimonio){
        try (BufferedReader reader = new BufferedReader(new FileReader("gpip/database/patrimonioDatabase.txt"));){
            String linha;
            while ((linha = reader.readLine()) != null) {
                String [] partes = linha.split(",");
                if(patrimonio.getNumeroTombo().equals(partes[0]) && patrimonio.getIdInstituicao().equals(partes[4])){
                    return true;
                }
            }

        }catch (IOException e){
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return false;
    }
}
