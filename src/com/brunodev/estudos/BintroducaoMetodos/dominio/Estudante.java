package com.brunodev.estudos.BintroducaoMetodos.dominio;

public class Estudante {

    //atributos:
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println("------------");
        System.out.println(this.nome); //O this também serve para diferenciar o atributo do objeto de uma variável do método (parâmetro ou local) quando elas têm o mesmo nome.
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
