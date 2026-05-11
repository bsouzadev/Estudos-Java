package com.brunodev.estudos.Npolimorfismo.servico;

import com.brunodev.estudos.Npolimorfismo.dominio.Computador;
import com.brunodev.estudos.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calculaImpostoPC(Computador computador){
        System.out.println("Relatorio de imposto do computador: ");
        double taxaProduto = computador.taxaProduto();
        System.out.println("Computador " + computador.getNome());
        System.out.println("Valor " + computador.getValor());
        System.out.println("Imposto a ser pago " + taxaProduto);
    }

    public static void calculaImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de imposto do tomate: ");
        double taxaProduto = tomate.taxaProduto();
        System.out.println("Tomate " + tomate.getNome());
        System.out.println("Valor " + tomate.getValor());
        System.out.println("Imposto a ser pago " + taxaProduto);
    }
}
