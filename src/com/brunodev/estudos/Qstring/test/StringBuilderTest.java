package com.brunodev.estudos.Qstring.test;

public class StringBuilderTest {
    static void main(String[] args) {
        String nome = "Bruno";
        nome.concat("Augusto");
        nome.substring(0,2);
        System.out.println(nome);

        //A StringBuilder é mutável. É uma classe que trabalha com as strings e a diferença é que ela é mutável.
        //StringBuilder é mais rápido que a string normal, pois ela é mutável, fazendo assim não precisar criar um novo objeto a cada alteração, pois elas alteram o mesmo objeto na memória
        StringBuilder sb = new StringBuilder("Bruno");
        sb.append(" Augusto"); //Adiciona (concatena) na StringBuilder
        //String substring = sb.substring(0,9);
        sb.reverse();
        sb.delete(0,6);
        System.out.println(sb);
    }
}