package com.brunodev.estudos.exercicios.faculdade.lista1.test;

import com.brunodev.estudos.exercicios.faculdade.lista1.dominio.Conta;
import com.brunodev.estudos.exercicios.faculdade.lista1.dominio.ContaInterface;

public class UsaConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        ContaInterface ci = new ContaInterface();
        
        ci.recebeConta(conta);
    }
}
