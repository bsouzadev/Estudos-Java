package com.brunodev.estudos.exercicios.faculdade;

public class Circulo { //classe, que representa uma entidade do mundo real.

    //Atributo = variável da classe (característica do objeto).
    private double raio; //atributo, características definidas na classe e que cada objeto possui. (private só pode ser acessado dentro da classe).

    public Circulo(double raio){
        this.raio = raio; //tem raio como parametro do metodo, e como atributo da classe. O this serve para diferenciar (this.raio é o atributo da classe).
    }
    
    public double area(){
        return 3.1415 * raio * raio;
    }
}