package com.brunodev.estudos.introducao.estruturasRepeticao;

public class ExercicioBreak {
    // dado o valor de preço de um carro, descubra em quantas vezes ele pode ser
    // parcelado.
    // valor da parcela >= 1000.
    public static void main(String[] args) {
        double valorCarro = 30000;
        int quantidadeParcelas = 0;

        for (int i = 1; i < valorCarro; i++) {
            if ((valorCarro / i) >= 1000) {
                quantidadeParcelas++;
            } else {
                break;
            }
        }

        System.out.println("Total de parcelas: " + quantidadeParcelas);
    }
}