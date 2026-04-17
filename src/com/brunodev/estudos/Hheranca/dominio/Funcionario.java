package com.brunodev.estudos.Hheranca.dominio;

// Ao fazermos a herança da classe Pessoa, todos os membros públicos e protegidos
// são herdados pela classe Funcionario.
//
// A classe filha também herda o método imprime(), porém ele só imprime os atributos
// que existem na classe Pessoa.
//
// Como a classe Funcionario possui o atributo salario, que não existe em Pessoa,
// ele não será exibido pelo método imprime() herdado.
//
// Para incluir o salario na impressão, sobrescrevemos o método imprime() na classe
// Funcionario e utilizamos super.imprime() para reaproveitar o comportamento da
// classe mãe, adicionando depois a impressão do salario.

//não tem herança multipla no javinha.

public class Funcionario extends Pessoa{
    private double salario;


    static{
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario2");
    }


    //
    public  Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de Funcionario");
    }

    //
    public void imprime(){ //sobrescrevendo o metodo
        super.imprime(); //super serve para chamar o metodo imprime da classe mãe (pessoa).
        System.out.println(this.salario);
    }

    //
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    
}
//Construtores não são herdados.
//A classe filha SEMPRE chama o construtor da mãe (chama o vazio), super serve para chamar o construtor da mãe.
//Todas as vezes que na classe mãe tem um construtor com parametro, tem que adicionar um construtor nas classes filhas, igual no exemplo acima.
//Se a classe mãe não tem construtor vazio, é obrigado a criar um construtor na filha e chamar super(...).