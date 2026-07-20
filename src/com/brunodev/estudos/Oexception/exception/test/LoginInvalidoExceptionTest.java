package com.brunodev.estudos.Oexception.exception.test;

import com.brunodev.estudos.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usernameDB = "Bruno";
        String senhaDB = "1234";
        System.out.println("Usuário: ");
        String userNameDigitado = sc.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = sc.nextLine();
        if (!usernameDB.equals(userNameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Login ou Senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
