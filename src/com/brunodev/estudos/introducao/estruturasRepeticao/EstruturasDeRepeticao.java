package com.brunodev.estudos.introducao.estruturasRepeticao;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while
        int count = 0;
        while (count < 10) { // valores booleanos, tem que ser positivos para rodar o loop.
            System.out.println(count);
            count++;
        }

        // do while
        count = 0;
        do { // faça enquanto...
            System.out.println("do-while " + ++count);
        } while (count == 10);

        // for
        for(int i =0; i<10; i++){
            System.out.println("For\n");
        }
    }
}
