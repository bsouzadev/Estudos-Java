package com.brunodev.estudos.exercicios.faculdade.lista1.dominio;

public class ContaInterface {

    // metodo:
    public void recebeConta(Conta conta) {
        System.out.println("----------MENU----------");
        System.out.print("Digite 1 para sair do menu: ");
        System.out.print("Digite 2 para depositar um valor em sua conta: ");
        System.out.print("Digite 3 para sacar um valor: ");
        System.out.print("Digite 4 para conferir o seu saldo: ");
        System.out.println("-------------------------");

        if (conta.getNumero() == 1) {
            return;
        } else if (conta.getNumero() == 2) {
            depositaDinheiro(conta.setDeposita());
        } else if (conta.getNumero() == 3) {
            conta.sacarDinheiro(x);
        } else if (conta.getNumero() == 4) {
            System.out.println("Saldo: " + conta.getSaldo());
        }
    }
}
