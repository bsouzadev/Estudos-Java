package com.brunodev.estudos.introducao.arranjos;

public class Matrizes {
    public static void main(String[] args) {
        // primeiro array representa os meses
        // o segundo representa os dias do mes.
        int dias[][] = new int[3][3];

        for (int i = 0; i < dias.length; i++) {
            for (int k = 0; k < dias.length; k++) {
                dias[i][k] = 10;
            }
        }

        //
        for (int i = 0; i < dias.length; i++) {
            for (int k = 0; k < dias[i].length; k++) { // pega o "tamanho de cada ref do vetor apontado".
                System.out.println(dias[i][k]);
            }
            System.out.println();
        }

        //
        System.out.println("Utilizando foreach");
        for (int arrayBase[] : dias) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}
