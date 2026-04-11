package com.brunodev.estudos.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTeclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        
        char sexo = sc.next().charAt(0); //pega a primeira letra da palavra.
        System.out.println(sexo);
    }
}
