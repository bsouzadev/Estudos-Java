package com.brunodev.estudos.introducao.arranjos;

public class ArranjoArrays2 {
    public static void main(String[] args) {
        int[] idade = new int[] { 1, 3, 4, 1, 3 }; // se pode inicializar assim ou somente com {1,3,1,23};

        // outra forma de imprimir uma array, através do foreach
        for (int i : idade) { //"contador" tem que ser do tipo do array (int). E depois colocar o nome da array.
            System.out.println(i);
        }
    }
}
