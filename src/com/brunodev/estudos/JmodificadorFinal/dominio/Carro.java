package com.brunodev.estudos.JmodificadorFinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; //Valor constante, não muda. A variável tem essa assinatura. E ela precisa ter um valor pré-definido.
    public final Comprador COMPRADOR = new Comprador(); //A referencia da variável comprador nunca poderá ser alterada.

    //
    public final void imprime(){
        System.out.println(this.getNome());
    }

    //
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
