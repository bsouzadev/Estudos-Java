package com.brunodev.estudos.exercicios.faculdade.lista1.test;

import com.brunodev.estudos.exercicios.faculdade.lista1.dominio.Conta2;
import com.brunodev.estudos.exercicios.faculdade.lista1.dominio.Containterface2;

public class UsaConta2 {
    public static void main(String[] args) {
        Conta2 conta = new Conta2();
        Containterface2 c1 = new Containterface2();

        c1.menu(conta);
    }
}
