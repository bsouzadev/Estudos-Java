package com.brunodev.estudos.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    static void main(String[] args) {

        // \d = retorna todos os dígitos.
        // \D = retorna tudo o que não for digito.
        // \s = retorna todos os espaços em branco (\n, \t, \f, \r).
        // \S = retorna todos caracteres excluindo os brancos (do domínio de \s).
        // \w = retorna todas as letras de a-z A-z, dígitos e _.
        // \W = retorna tudo o que não está no domínio de \w.
        // [] = intervalos (range), permite agrupar opções de caracteres.

        //String regex = "[abcABC]"; //Procura ou por a, por b, por c (maiúsculos e minuscules).
        //String regex = "[a-zA-C]"; //Procura por a - z ou, A - C.

        //Pequeno exercício: Fazer uma expressão regular que retorne todos os números hexadecimais validos (para ser um hexadecimal valido tem que começar com 0x/X, ter algum número/letra depois, e as letras não podem passar de F.
        String regex = "0[xX][0-9a-fA-f]"; //Procura por uma expressão que começe com 0 e, x ou X e, 0-9 ou a-f ou A-F.
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";


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
