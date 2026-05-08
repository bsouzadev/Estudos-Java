package com.brunodev.JclassesAbstratas.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
        calculaDesconto();
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calculaDesconto() {
        this.salario = this.salario + this.salario * 0.1;
    }

    @Override
    public void imprime() {

    }
}
