package com.brunodev.estudos.arranjos;

public class ArranjosArrays {
    public static void main(String[] args) {
        // int idade está fazendo referencia a um objeto em memoria (new int).
        // todos os tipos primitivos inicializa comm um valor.
        int[] idades = new int[3]; // não é tipo primitivo, arrays do lado direito (new) é considerada um objeto.
        idades[0] = 10;
        idades[1] = 11;
        idades[2] = 23;

        for(int i =0; i<idades.length; i++) System.out.println(idades[i]);
    }
}
