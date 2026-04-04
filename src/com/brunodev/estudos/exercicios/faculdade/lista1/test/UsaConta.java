package com.brunodev.estudos.exercicios.faculdade.lista1.test;

import com.brunodev.estudos.exercicios.faculdade.lista1.dominio.Conta;
import com.brunodev.estudos.exercicios.faculdade.lista1.dominio.Containterface;

public class UsaConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Containterface c1 = new Containterface();

        c1.menu(conta);
    }
}
