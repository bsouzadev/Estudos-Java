package com.brunodev.estudos.exercicios.faculdade.lista1.test;

import com.brunodev.estudos.exercicios.faculdade.lista1.dominio.Banco;
import com.brunodev.estudos.exercicios.faculdade.lista1.dominio.BancoInterface;


public class UsaConta {
    public static void main(String[] args) {
        Banco banco = new Banco();
        BancoInterface bi = new BancoInterface(banco);
        bi.menu();
    }
}
