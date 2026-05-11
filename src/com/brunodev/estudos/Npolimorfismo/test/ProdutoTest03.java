package com.brunodev.estudos.Npolimorfismo.test;

import com.brunodev.estudos.Npolimorfismo.dominio.Computador;
import com.brunodev.estudos.Npolimorfismo.dominio.Produto;
import com.brunodev.estudos.Npolimorfismo.dominio.Tomate;
import com.brunodev.estudos.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    //polimorfismo na pratica:
    static void main(String[] args) {
        Produto produto = new Computador("Ryzen 3", 300);

        Tomate tomate = new Tomate("Espanhol", 23.99);
        tomate.setDataValidade("11/12/1982");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
