package com.brunodev.estudos.Npolimorfismo.dominio;

public abstract class Produto implements Taxavel{
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor){
        this.valor = valor;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
