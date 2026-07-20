package com.brunodev.estudos.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception { //Se cria uma exceção e informa o tipo dela (checked ou unchecked).

    public LoginInvalidoException() {
        super("Login Invalido");
    }

    public LoginInvalidoException(String message) { //Para mensagens personalizadas
        super(message);
    }
}