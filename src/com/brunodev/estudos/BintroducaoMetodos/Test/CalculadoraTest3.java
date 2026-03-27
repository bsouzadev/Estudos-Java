package com.brunodev.estudos.BintroducaoMetodos.Test;

import com.brunodev.estudos.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest3 {
    public static void main(String[] args){
        Calculadora calc = new Calculadora();

        double result = calc.divideDoisNum(100, 2);

        System.out.println(result);
        //outra forma de imprimir:
        System.out.println(calc.divideDoisNum(100, 2)); //o metodo ja retorna um numero, se o metodo retornasse um print, não seria possivel fazer isso.

        System.out.println("--------------");

        calc.imprimeDiv(10, 2);

    }
}
