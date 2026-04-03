package com.brunodev.estudos.exercicios.faculdade.lista1.dominio;

import java.util.Scanner;

public class Containterface2 {
    private int opcaoMenu;

    public void menu(Conta2 conta){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("========== MENU ==========");
            System.out.println("Digite 1 para sair do menu");
            System.out.println("Digite 2 para depositar um valor");
            System.out.println("Digite 3 para sacar um valor");
            System.out.println("Digite 4 para conferir um saldo");
            System.out.println("===========================");
            opcaoMenu = sc.nextInt();

            if(opcaoMenu == 1){
                break;
            } else if(opcaoMenu == 2){
                System.out.println("Digite um valor para fazer um deposito:");
                conta.deposito(sc.nextDouble());
            } else if(opcaoMenu == 3){
                System.out.println("Digite o valor que voce quer sacar:");
                conta.sacar(sc.nextDouble());
            } else if (opcaoMenu == 4){
                conta.conferirSaldoo();                
            }
        }

        sc.close();
    }
}
