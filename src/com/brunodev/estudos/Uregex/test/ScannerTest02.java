package com.brunodev.estudos.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner sc = new Scanner(texto); //Scanner tem um delimitador padrão que é o " ".
        sc.useDelimiter(","); //Mudando o delimitador de " " para ,.

        while (sc.hasNext()){ //Enquanto existir um proximo valor pegue ele.
            //System.out.println(sc.next()); exibe esse valor

            //Agora digamos que queremos pegar o tipo desse valor.
            if(sc.hasNextInt()){
                int aux = sc.nextInt();
                System.out.println("Inteiro: " + aux);
            } else if (sc.hasNextBoolean()) {
                boolean b = sc.nextBoolean();
                System.out.println("Booleano: " + b);
            } else {
                System.out.println(sc.next());
            }


        }
    }
}