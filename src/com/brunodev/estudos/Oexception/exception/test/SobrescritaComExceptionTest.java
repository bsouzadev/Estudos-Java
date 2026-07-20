package com.brunodev.estudos.Oexception.exception.test;

import com.brunodev.estudos.Oexception.exception.dominio.Funcionario;
import com.brunodev.estudos.Oexception.exception.dominio.LoginInvalidoException;
import com.brunodev.estudos.Oexception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
