package com.brunodev.estudos.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest {
    static void main(String[] args) {
        //O metodo .resolve() serve para juntar caminhos, ou seja, combinar uma pasta base com um subdiretório ou arquivo.

        Path dir = Paths.get("home/bruno");
        Path arq = Paths.get("dev/arq.txt");
        Path resolve = dir.resolve(arq);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/bruno");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        //A ordem certa sempre deve ser do absoluto para o relativo OU relativo para relativo.
        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + absoluto.resolve(file));
        System.out.println("3 " + relativo.resolve(absoluto)); //Fazer um resolve com um arq que já é absoluto o java irá retornar o própio caminho absoluto.
        System.out.println("4 " + relativo.resolve(file));
        System.out.println("5 " + file.resolve(absoluto)); //Fazer um resolve com um arq que já é absoluto o java irá retornar o própio caminho absoluto.
        System.out.println("6 " + file.resolve(relativo));
    }
}
