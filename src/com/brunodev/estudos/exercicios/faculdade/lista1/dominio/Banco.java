package com.brunodev.estudos.exercicios.faculdade.lista1.dominio;

public class Banco {
    private Conta[] conta;
    private int cont;

    public Banco() {
        conta = new Conta[5];
        cont = 0;
    }

    public void adicionaConta(Conta conta) {
        this.conta[cont] = conta;
    }

    public Conta procuraConta(int indice) {
        return conta[indice];
    }
}