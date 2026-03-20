package com.brunodev.estudos.condicionais;

import java.util.Scanner;

public class CondicionaisSwitch {
    public static void main(String[] args) {
        // imprimir o dia da semana, considerando 1 como domingo.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7, para indicar um dia da semana: ");
        byte dia = sc.nextByte();
        sc.close();

        // valores como parametros que pode colocar no switch: char, int, byte, short,
        // enum, String (Versão 8 java).

        switch (dia) {
            case 1: // caso seja...
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção invalida");
                break;
            // caso o usuario digite um numero que não está entre 1 a 7, cairá nesse
            // default.

        } // nescessario dar o comando de parada Brake, se não ele executa todas as condições verdadeiras.
    }

}
