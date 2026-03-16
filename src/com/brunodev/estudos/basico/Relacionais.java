package com.brunodev.estudos.basico;

public class Relacionais {
    public static void main (String[] args){
        int resto = 20 % 2;
        System.out.println(resto);

        //operadores logicos: < > , <= , >= , == , != sempre irão retornar 0 ou 1 (False, true).

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+ isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+ isDezMenorQueVinte);
        System.out.println("isDezIgualADez " + isDezIgualADez);
        System.out.println("isDezDiferenteDeDez " + isDezDiferenteDeDez);

    }
}
