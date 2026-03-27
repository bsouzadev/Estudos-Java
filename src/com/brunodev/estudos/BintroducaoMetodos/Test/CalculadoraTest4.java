package com.brunodev.estudos.BintroducaoMetodos.Test;

import com.brunodev.estudos.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest4 {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNum(num1, num2); //passagem de tipos primitivos para um metodo é sempre por valor (copia).
        System.out.println("Fora do metodo: ");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
