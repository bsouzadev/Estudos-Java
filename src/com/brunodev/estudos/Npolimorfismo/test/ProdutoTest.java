package com.brunodev.estudos.Npolimorfismo.test;

import com.brunodev.estudos.Npolimorfismo.dominio.Computador;
import com.brunodev.estudos.Npolimorfismo.dominio.Produto;
import com.brunodev.estudos.Npolimorfismo.dominio.Tomate;
import com.brunodev.estudos.Npolimorfismo.servico.CalculadoraImposto;


public class ProdutoTest {
    static void main(String[] args) {
        Produto produto = new Computador("Ryzen 2", 60);
        Produto produto1 = new Tomate("Tomate cereja", 10);

        CalculadoraImposto.calcularImposto(produto);
        System.out.println("-------");
        CalculadoraImposto.calcularImposto(produto1);
    }
}
