package com.brunodev.estudos.Npolimorfismo.test;

import com.brunodev.estudos.Npolimorfismo.dominio.Computador;
import com.brunodev.estudos.Npolimorfismo.dominio.Tomate;
import com.brunodev.estudos.Npolimorfismo.servico.CalculadoraImposto;

public class Produto {
    static void main(String[] args) {
        Computador computador = new Computador("Ryzen 2", 60);
        Tomate tomate = new Tomate("Tomate cereja", 10);

        CalculadoraImposto.calculaImpostoPC(computador);
        System.out.println("-------");
        CalculadoraImposto.calculaImpostoTomate(tomate);
    }
}
