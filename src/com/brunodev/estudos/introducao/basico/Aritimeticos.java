package com.brunodev.estudos.introducao.basico;

public class Aritimeticos {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int resultado = num1 + num2;

        System.out.println(resultado);
        System.out.println(num1*num2);
        System.out.println((float)num1/num2); //ou double.
        System.out.println(num1-num2);
        

        System.out.println("-------------------------------");
        System.out.println(num1 + num2); //+ funciona com operador soma
        System.out.println("Valor: "+ num1 + num2); //+ funciona como concatenação
        System.out.println(num1 + num2 +" Valor: "+ num1 + num2);
    }
}
