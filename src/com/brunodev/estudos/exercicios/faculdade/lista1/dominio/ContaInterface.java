package com.brunodev.estudos.exercicios.faculdade.lista1.dominio;

import java.util.Scanner;

public class ContaInterface {

    private boolean verifica = true;
    private int menu;

    // metodo:
    public void recebeConta(Conta conta) {
        Scanner sc = new Scanner(System.in);

        while (verifica) {
            System.out.println("----------MENU----------");
            System.out.println("Digite 1 para sair do menu: ");
            System.out.println("Digite 2 para depositar um valor em sua conta: ");
            System.out.println("Digite 3 para sacar um valor: ");
            System.out.println("Digite 4 para conferir o seu saldo: ");
            System.out.println("-------------------------");
            menu = sc.nextInt();

            if (menu > 4 || menu < 1) {
                System.out.println("Digite um numero valido entre 1 e 4!");
            }

            else if (menu == 1) {
                verifica = false;
                break;
            } 

            else if (menu == 2) {
                System.out.println("Digite o valor para depositar: ");
                double valor = sc.nextDouble();
                conta.depositaDinheiro(valor);
            }

            else if (menu == 3) {
                System.out.println("Digite o valor para sacar: ");
                double sacar = sc.nextDouble();
                conta.sacarDinheiro(sacar);
            }
             
            else if (menu == 4) {
                conta.conferirSaldo();
            }
        }

        sc.close();
    }
}
