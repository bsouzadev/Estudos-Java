package com.brunodev.estudos.estruturasRepeticao;

public class EstruturasContinue {
    public static void main(String[] args) {
        double valorTotal = 30000;

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue; // não irá para a linha 13.
            }

            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}