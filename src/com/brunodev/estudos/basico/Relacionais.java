package com.brunodev.estudos.basico;

public class Relacionais {
    public static void main (String[] args){
        int resto = 20 % 2;
        System.out.println(resto);

        //operadores logicos: < > , <= , >= , == , != sempre irão retornar 0 ou 1 (False, true).

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualADez = 10 == 9; //era ==
        boolean isDezDiferenteDeDez = 10 != 11; //era !=
        System.out.println("isDezMaiorQueVinte "+ isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+ isDezMenorQueVinte);
        System.out.println("isDezIgualADez " + isDezIgualADez);
        System.out.println("isDezDiferenteDeDez " + isDezDiferenteDeDez);

        System.out.println("------------------------");

        //operadores logicos: && (AND), || (OR), ! (NOT). 
        int idade = 19;
        float salario = 1.450f;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 20 && salario >= 4000; //&& as duas condições tem que dar verdaderias para dar true.
        boolean isDentroDaLeiMenorQueTrinta = idade < 20 && salario >= 2000;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);


        System.out.println("Operação com o OU (||).");

        double contaCorrente = 200;
        double contaPoupanca = 10000;
        float valorPlay = 5.000f;
        boolean isPs5Compravel = contaCorrente > valorPlay || contaPoupanca > valorPlay; //pelo menos uma tem que dar verdadeiro para ser True.
        System.out.println("isPs5Compravel " + isPs5Compravel);

        System.out.println("------------------------");

        //atribuição: = , += , -= , *= , /= , %=.
        double bonus = 1800;
        bonus += 1000; //bonus = bonus + 1000.
        System.out.println("Soma: " + bonus);
        bonus -= 5;
        System.out.println("Subtração: " + bonus);
        bonus *= 2;
        System.out.println("Multiplicação: " + bonus);
        bonus /= 2;
        System.out.println("Divisão: " + bonus);
        bonus %= 2;
        System.out.println("Resto: " + bonus);


        //-- , ++:
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        System.out.println(contador);

        System.out.println("++ antes:");
        int contador2 =0;
        System.out.println(contador2++); //printa primeiro, e depois encrementa.
        System.out.println(++contador2); //encrementa primeiro, e depois printa.

   }
}
