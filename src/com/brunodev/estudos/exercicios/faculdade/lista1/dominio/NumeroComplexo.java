package com.brunodev.estudos.exercicios.faculdade.lista1.dominio;

public class NumeroComplexo {
    // atributos:
    private double a;
    private double b;

    // construtor:
    public NumeroComplexo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public NumeroComplexo(){

    }

    public NumeroComplexo soma(NumeroComplexo numero){
        return new NumeroComplexo( //criando um novo numero complexo para retornar.
            this.a + numero.a, //this é o numero complexo que chamou a fun. Ou seja, this faz referencia para o objeto que chamou.
            this.b + numero.b
        );
    }

    public NumeroComplexo produto(NumeroComplexo numero){
        return new NumeroComplexo(
            (this.a * numero.a - this.b * numero.b),
            (this.a * numero.b + this.b * numero.a)
        );
    }

    public NumeroComplexo conjugado(){
        return new NumeroComplexo(this.a, -this.b);
    }
    

    @Override
    public String toString() {
        return this.a + " + " + this.b + "i";
        //faz referencia para o propio objeto que o chamou.
    }
}