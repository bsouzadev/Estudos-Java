package com.brunodev.estudos.LclassesAbstratas.dominio;

public abstract class  Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    //
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void calculaDesconto();
}
