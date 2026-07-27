package com.brunodev.estudos.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {
    static void main(String[] args) {
        //Pattern e Matcher são as duas classes principais do pacote java.util.regex usadas para trabalhar com expressões regulares (regex), servindo para buscar, validar e extrair padrões de textos
        //Expressões regulares: é uma sequência de caracteres que forma um padrão de busca. Ela serve principalmente para validar dados, buscar ou substituir partes de textos de forma rápida e segura.

        String regex = "aba"; //Expressões regular.
        //String texto = "abaaba";
        String texto2 = "abababa";

        //Usamos duas classes para trabalhar com regex em java:
        //Pattern que é o padrão de busca, e a Matcher que encontra o padrão.
        Pattern pattern = Pattern.compile(regex); //.compile valida se essa expressão regular funciona.
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("índice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("posições encontradas");

        while (matcher.find()){ //Enquanto o matcher encontrar o regex no texto

            System.out.print(matcher.start() + " "); // matcher.start() retorna o índice exato da primeira letra onde o padrão começa no texto.
        }
    }
}
