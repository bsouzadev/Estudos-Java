package com.brunodev.estudos.estruturasRepeticao;

public class EstruturasBrake {
    // dado um numero de 0 a 50, imprimir os 25 primeiros numeros:
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i == 26) {
                break;
            }

            System.out.println(i);
        }
    }
}
