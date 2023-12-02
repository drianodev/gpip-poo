package main.controller;

import main.entity.Usuario;
import main.services.isValidEmail;
import main.services.isValidName;
import main.services.isValidPassword;

public class CadastroController {

    public CadastroController(){

    }
    public void CadastrarUsuario(String email, String nome, String password){
        System.out.println(isValidEmail.validEmail(email));
        System.out.println(isValidName.validName(nome));
        System.out.println(isValidPassword.validPassword(password));
    }
}
