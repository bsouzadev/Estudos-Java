package com.brunodev.estudos.BintroducaoMetodos.dominio;

public class Pessoa {

    //o modificador de acesso privado significa que os atributos da classe só vão ser acessados pela propria classe.
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    //para acessar os atributos privados, damos um método para acessar esses atributos:
    //método fica publico, e o atributo privado.
    public void setNome(String nome){ //metodo set serve para alterar o valor de um atributo privado, permitindo validação e controle.
        this.nome = nome;
    }

    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade invalida!");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){ //metodo get serve retornar o valor de um atributo privado.
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
