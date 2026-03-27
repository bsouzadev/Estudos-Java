package com.brunodev.estudos.AintroducaoClasses.test;

import com.brunodev.estudos.AintroducaoClasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.ano = 2012;
        c1.modelo = "Sedã";
        c1.nome = "Audi A3";

        c2.ano = 2022;
        c2.modelo = "Heat";
        c2.nome = "Polo";

        System.out.println("Caracteristicas primeiro carro: ");
        System.out.println("Nome: " + c1.nome + " Modelo: " + c1.modelo + " Ano: " + c1.ano);
        System.out.println("Caracteristicas segundo carro: ");
        System.out.println("Nome: " + c2.nome + " Modelo: " + c2.modelo + " Ano: " + c2.ano);
    }
}
