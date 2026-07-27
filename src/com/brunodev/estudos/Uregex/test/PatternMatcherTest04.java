package com.brunodev.estudos.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; //Procura por uma expressão especifica que começe com 0 e, x ou X e, (0-9 ou a-f ou A-F) uma ou mais vezes, e seguido de espaço em branco ou fim da linha.
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";


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
