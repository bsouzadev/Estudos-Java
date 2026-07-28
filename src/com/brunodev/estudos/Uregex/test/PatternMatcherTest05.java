package com.brunodev.estudos.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    static void main(String[] args) {
        // \d = retorna todos os dígitos.
        // \D = retorna tudo o que não for digito.
        // \s = retorna todos os espaços em branco (\n, \t, \f, \r).
        // \S = retorna todos caracteres excluindo os brancos (do domínio de \s).
        // \w = retorna todas as letras de a-z A-z, dígitos e _.
        // \W = retorna tudo o que não está no domínio de \w.
        // [] = intervalos (range), permite agrupar opções de caracteres.
        // Quantificadores: definem quantas vezes um caractere ou grupo anterior deve aparecer. Sendo eles:
        // ? = zero ou uma.
        // * = zero ou mais.
        // + = uma ou mais.
        // {n,m} = de n até m.
        // {n} = exatamente n vezes.
        // {n,} = no mínimo n vezes.
        // () = agrupamento.
        // | = ou
        // $ = representa o fim da linha.
        // . 1.3 = retorna tudo que está entre 1 e 3, como: 123, 133, 1@3, 1A3.
        // ^ = representa negação para um conjunto de caracteres. Exemplo: [^abc] retorna tudo o que não for a ou b, ou c.
        // Ele também serve para encontrar o que você quer no começo da linha. Exemplo: ^teste localiza a palavra "teste" somente se ela estiver no começo da frase, ignorando se aparecer no meio de outra linha.

        //Pequeno exercício: Encontrar todos os emails validos.
        String regex = "([a-z0-9A-Z])+@(gmail\\.com|hotmail\\.com)"; //Procura por uma expressão especifica que tenha ([a-z ou 0-9 ou A-Z]) uma ou mais de uma vezes, e @, e (gmail.com ou hotmail.com)
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@gmail";

        //jeito do professor:
        //String regex = "([a-zA-Z0-9\\.-_])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        //System.out.println("#@!zoro@mail.br".matches(regex)); //.matches() verifica e retorna se a String faz parte de uma expressão regular.
        //System.out.println(texto.split(",")[1].trim());

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("posições encontradas");

        while (matcher.find()){

            System.out.print(matcher.start() + " " + matcher.group() + "\n "); // matcher.group() retorna os valores.
        }

    }
}
