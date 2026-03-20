package com.brunodev.estudos.estruturasRepeticao;

public class ExercicioFor {
    public static void main(String[] args) {
        // imprimir todos os numeros pares de 0 a 1000000.
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}