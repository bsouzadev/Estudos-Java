package com.brunodev.estudos.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    static void main(String[] args) {
        //Digamos que eu tenha o texto2 e quero tirar/encontrar somente os números. Usaremos os Meta caracteres para isso.
        //Os meta caracteres em Regex no Java são caracteres especiais com funções específicas para encontrar padrões em textos.

        // \d = retorna todos os dígitos.
        // \D = retorna tudo o que não for digito.
        // \s = retorna todos os espaços em branco (\n, \t, \f, \r).
        // \S = retorna todos caracteres excluindo os brancos (do domínio de \s).
        // \w = retorna todas as letras de a-z A-z, dígitos e _.
        // \W = retorna tudo o que não está no domínio de \w.

        String regex = "\\W";
        //String texto = "abaaba";
        String texto2 = "@#hh_j2 12gvh21";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("índice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("posições encontradas");

        while (matcher.find()){

            System.out.print(matcher.start() + " " + matcher.group() + "\n "); // matcher.group() retorna os valores.
        }
    }
}
