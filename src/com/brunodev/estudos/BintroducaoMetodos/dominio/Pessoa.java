package com.brunodev.estudos.BintroducaoMetodos.dominio;

//acoplamento = o quanto uma classe conhece/depende da outra.
//Coesão = o quanto uma classe é focada em uma única responsabilidade (uma classe, uma responsabilidade).
//alto acoplamento é ruim, baixo é bom. Alta coesão bom, baixa é ruim.
public class Pessoa {

    //o modificador de acesso privado significa que os atributos da classe só vão ser acessador pela propia classe.
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    //para acessar os atributos privatos, damos um metodo para acessar esses atributos:
    //metodo fica publico, e o atributo privado.
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
