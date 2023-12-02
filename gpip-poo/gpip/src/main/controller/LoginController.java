package main.controller;

import main.services.loginService;

import static main.services.loginService.verificarCredenciais;

public class LoginController {

    public LoginController(){}

    public String Login(String email, String password){
        String arquivo = "gpip/database/userDatabase.txt";
        return verificarCredenciais(arquivo, email, password);
    }
}
