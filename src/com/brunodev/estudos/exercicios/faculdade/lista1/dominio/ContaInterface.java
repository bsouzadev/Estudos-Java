package com.brunodev.estudos.exercicios.faculdade.lista1.dominio;

import java.util.Scanner;

public class ContaInterface {

    private boolean verifica = true;

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
            conta.setNumero(sc.nextInt());

            if (conta.getNumero() == 1) {
                verifica = false;
                return;
            } else if (conta.getNumero() == 2) {
                System.out.println("Digite o valor para depositar: ");
                double valor = sc.nextDouble();
                conta.depositaDinheiro(valor);
            } else if (conta.getNumero() == 3) {
                System.out.println("Digite o valor para sacar: ");
                double sacar = sc.nextDouble();
                conta.sacarDinheiro(sacar);
            } else if (conta.getNumero() == 4) {
                conta.conferirSaldo();
            }
        }

        sc.close();
    }
}
