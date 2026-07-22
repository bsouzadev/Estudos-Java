package com.brunodev.estudos.Qstring.test;

public class StringPerformaceTest {
    static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " +(fim-inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " +(fim-inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " +(fim-inicio) + "ms");
    }

    private static void concatString(int tam){
        String texto = "";
        for (int i =0; i<tam; i++){
            texto += i;
        }
    }

    private static void concatStringBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);
        for (int i =0; i<tam; i++){
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tam){
        StringBuffer sb = new StringBuffer(tam);
        for (int i =0; i<tam; i++){
            sb.append(i);
        }
    }
}

//A String tradicional é imutável (cria um novo objeto a cada alteração). Por isso demora mais.
// O StringBuilder e o StringBuffer são mutáveis e alteram o mesmo objeto na memória, mas o
// StringBuffer é seguro para uso simultâneo (thread-safe). Por isso demora menos.