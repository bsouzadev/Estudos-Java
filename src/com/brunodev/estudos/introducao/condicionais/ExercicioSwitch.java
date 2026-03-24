package com.brunodev.estudos.introducao.condicionais;

import java.util.Scanner;

public class ExercicioSwitch {
    // utilizando switch, dado os valores de 1 a 7, imprima se é dia ultil ou final
    // de semana
    // considerando o domingo como 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana, e veja se ele é dia util ou não: ");
        byte diaDaSemana = sc.nextByte();
        sc.close();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia ultil");
                break;
            case 3:
                System.out.println("Dia ultil");
                break;
            case 4:
                System.out.println("Dia ultil");
                break;
            case 5:
                System.out.println("Dia ultil");
                break;
            case 6:
                System.out.println("Dia ultil");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
