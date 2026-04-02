package com.brunodev.estudos.exercicios.faculdade.lista1.dominio;

public class Conta {
    //atributos:
    private int numero;
    private double saldo;

    public Conta(){

    }

    //metodos:
    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    //
    public void depositaDinheiro(double x){
        this.saldo += x;
    }

    public void sacarDinheiro(double x){
        this.saldo -= x;
    }

    public void conferirSaldo(){
        System.out.println(setSaldo());
    }

}

