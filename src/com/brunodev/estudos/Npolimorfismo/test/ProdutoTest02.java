package com.brunodev.estudos.Npolimorfismo.test;

import com.brunodev.estudos.Npolimorfismo.dominio.Computador;
import com.brunodev.estudos.Npolimorfismo.dominio.Produto;
import com.brunodev.estudos.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    //polimorfismo na pratica:
    static void main(String[] args) {
        Produto produto = new Computador("Ryzen 3", 300);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.taxaProduto());

        System.out.println("------");

        Produto produto2 = new Tomate("Espanhol", 23.99);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.taxaProduto());
    }
}
