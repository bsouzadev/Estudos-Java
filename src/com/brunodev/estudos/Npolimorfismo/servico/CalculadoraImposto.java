package com.brunodev.estudos.Npolimorfismo.servico;

import com.brunodev.estudos.Npolimorfismo.dominio.Computador;
import com.brunodev.estudos.Npolimorfismo.dominio.Produto;
import com.brunodev.estudos.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto: ");
        double imposto = produto.taxaProduto(); //metodo da interface que for "herdado"
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
