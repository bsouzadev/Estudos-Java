package com.brunodev.estudos.BintroducaoMetodos.Test;

import com.brunodev.estudos.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest5 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int[] num = {1, 2, 3, 4, 5};
        calc.somaArray(num);

        //varArgs pode passar numeros diretamente.
        calc.somaVarArgs(1,32,123,123,123,1231,23);
    }
}
