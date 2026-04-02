package com.brunodev.estudos.exercicios.faculdade.lista1.dominio;

public class Conta {
    // atributos:
    private int numero;
    private double saldo;

    public Conta() {
        this.numero = 0;
        this.saldo = 0.0;
    }

    // metodos:
    public void setNumero(int numero) {
        if (numero >= 1) {
            this.numero = numero;
            return;
        }

        System.out.println("Numero invalido!\nPor favor, digite um numero valido!");
    }

    public int getNumero() {
        return this.numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    //
    public void depositaDinheiro(double x) {
        if (x > 0) {
            this.saldo += x;
            System.out.println("O valor de " + x + "$ foi adicionado em sua conta!");
            return;
        }

        System.out.println("Não é possivel depositar esse valor.\nPor favor, digite um valor valido!");

    }

    public void sacarDinheiro(double x) {
        if (x > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }

        this.saldo -= x;
        System.out.println("Voce sacou " + x + "$ de sua conta!");

    }

    public void conferirSaldo() {
        System.out.println("O saldo de sua conta é de: " + getSaldo() + "$");
    }

}
