package com.brunodev.estudos.Ycolecoes.test;

import com.brunodev.estudos.Ycolecoes.dominio.Smartphone;

public class EqualsTest {
    static void main(String[] args) {
        //Equals das str compara se uma str é igual a outra (conteúdo).
        //Equals da classe object compara se as variáveis de referência apontam para o mesmo objeto.

        Smartphone smartphone = new Smartphone("1ABC1", "iphone");
        Smartphone smartphone2 = new Smartphone("1ABC1", "iphone");
        System.out.println(smartphone.equals(smartphone2));
    }
}
