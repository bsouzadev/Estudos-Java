package com.brunodev.estudos.introducao.estruturasRepeticao;

public class EstruturasContinue {
    public static void main(String[] args) {
        // Quando o programa encontra o continue, ele ignora o restante do corpo do loop
        // e volta para o topo (no for) ou para a expressão booleana (no
        // while/do-while).

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