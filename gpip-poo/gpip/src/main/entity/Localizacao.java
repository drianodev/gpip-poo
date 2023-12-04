package main.entity;

import java.util.UUID;

public class Localizacao {

    private UUID id;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Localizacao(String logradouro, String numero, String bairro, String cidade, String estado, String cep) {
        this.id = UUID.randomUUID();
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if (logradouro != null && !logradouro.trim().isEmpty()) {
            this.logradouro = logradouro.trim();
        } else {
            throw new IllegalArgumentException("Logradouro não pode ser nulo ou vazio");
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLocalizacao(){
        return logradouro + "|" + numero + "|" + bairro + "|" + cidade +"|" + estado + "|" + cep;
    }
}
