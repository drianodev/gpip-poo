package main.controller;

import static main.model.LoginModel.verificarCredenciais;

public class LoginController {

    public LoginController(){}

    public String Login(String email, String password){
        String arquivo = "gpip/database/userDatabase.txt";
        return verificarCredenciais(arquivo, email, password);
    }
}
