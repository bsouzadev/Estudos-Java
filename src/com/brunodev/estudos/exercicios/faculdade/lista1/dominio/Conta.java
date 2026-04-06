package com.brunodev.estudos.exercicios.faculdade.lista1.dominio;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    // metodos:
    public void deposito(double saldo) {
        if (saldo > 0) {
            this.saldo += saldo;
            System.out.println("O deposito no valor de " + saldo + "$ foi efetuado com sucesso!");
            return;
        }

        System.out.println("Insira um valor valido para deposito!");
    }

    public void sacar(double saldo) {
        if(saldo <=0 || saldo > this.saldo){
            System.out.println("Insira um valor valido para sacar!");
            return;
        }
        
        System.out.println("Voce sacou " + saldo + "$");
        this.saldo -= saldo;
    }

    public void conferirSaldoo() {
        System.out.println("O seu saldo atual é de: " + this.saldo + "$");
    }
}
