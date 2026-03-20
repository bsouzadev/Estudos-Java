package com.brunodev.estudos.condicionais;

import java.util.Scanner;

//dado um determinado salario anual calcular quanto de imposto será cobrado.
public class Exercicio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual o seu salario ganho anualmente:");
        double salarioGanho = sc.nextFloat();
        double desconto =0;

        if(salarioGanho >= 0 && salarioGanho <= 34712){ //34,712 = 34712.
            desconto = (salarioGanho * 9.7)/100;
        } else if(salarioGanho >= 34.713 && salarioGanho <= 68507){
            desconto = (salarioGanho * 37.35)/100;
        } else {
            desconto = (salarioGanho * 49.50)/100;
        }
        sc.close();
        System.out.println("Valor do salario já com os descontos aplicados: " + desconto);
    }
}