package com.brunodev.estudos.exercicios.faculdade.lista1.test;

import com.brunodev.estudos.exercicios.faculdade.lista1.dominio.Conta;
import com.brunodev.estudos.exercicios.faculdade.lista1.dominio.ContaInterface;

public class UsaConta {
    public static void main(String[] args) {
        ContaInterface ci = new ContaInterface();
        Conta conta = new Conta();

        ci.recebeConta(conta);

    }
}
