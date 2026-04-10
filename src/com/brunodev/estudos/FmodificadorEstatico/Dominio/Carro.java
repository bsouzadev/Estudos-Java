package com.brunodev.estudos.FmodificadorEstatico.Dominio;

//static = uma variável única compartilhada por todos os objetos da classe
public class Carro {
    private String nome;
    private double velocidadeMax;
    public static double velocidadeLim = 250; // modificador statico, é um modificador que faz com que algo pertença à classe e não ao *objeto*, e todos as instancias vão compartilhar do mesmo valor.

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime() {
        System.out.println("----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMax);
        System.out.println("Velocidade limite: " + Carro.velocidadeLim); //O this é usado para referenciar o objeto atual (instância da classe). E não faz sentido colocar this, pois velocidade é static, ou seja é um atributo que pertence a classe e não depende de um objeto para ser acessado, se acessa pela propia classe. 
    }

    public String getNome() {
        return nome;
    }

    public double getVelocidadeLim() {
        return velocidadeLim;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
