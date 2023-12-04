package main.model;

import main.entity.Patrimonio;
import main.services.BuscarPatrimonio;

import java.io.*;

public class PatrimonioModel {

    public void PatrimonioModel(Patrimonio patrimonio){
        BuscarPatrimonio buscarPatrimonio = new BuscarPatrimonio();
        if(!buscarPatrimonio.buscarPatrimonio(patrimonio)){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("gpip/database/patrimonioDatabase.txt", true))){
                writer.write(patrimonio.getPatrimonio(patrimonio));
                writer.newLine();
                }catch (IOException e){
                    System.err.println("Erro ao ler o arquivo: " + e.getMessage());
                }
        }
    }
}
