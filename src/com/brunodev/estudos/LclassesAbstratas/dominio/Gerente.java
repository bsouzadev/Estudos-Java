package com.brunodev.estudos.LclassesAbstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome, salario);
        calculaDesconto();
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calculaDesconto() {
        this.salario = this.salario + this.salario * 0.2;
    }

    @Override
    public void imprime() {

    }
}
