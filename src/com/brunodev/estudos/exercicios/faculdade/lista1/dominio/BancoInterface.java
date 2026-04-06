package com.brunodev.estudos.exercicios.faculdade.lista1.dominio;

import java.util.Scanner;

public class BancoInterface {
    private Banco banco;
    private Containterface ci;
    private int opMenu;
    private Conta conta, aux;

    public BancoInterface(Banco banco){
        this.banco = banco;
    }

    public BancoInterface(){

    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=====MENU=====");
            System.out.println("Digite 1 para: sair");
            System.out.println("Digite 2 para: abrir uma nova conta");
            System.out.println("Digite 3 para: selecionar uma conta");
            System.out.println("==============");
            opMenu = sc.nextInt();

            if (opMenu == 1) {
                break;
            } else if (opMenu == 2) {
                System.out.println("Digite o número da conta desejado e informe o valor inicial para abertura: ");
                conta = new Conta(sc.nextInt(), sc.nextDouble());
                if(conta != null) System.out.println("Conta criada com sucesso!");
                ci = new Containterface();
                ci.menu(conta);
                banco.adicionaConta(conta);
            } else if(opMenu == 3){
                System.out.println("Digite o numero da conta:");
                aux = banco.procuraConta(sc.nextInt()); 
            }
        }

        //sc.close();
    }
}
