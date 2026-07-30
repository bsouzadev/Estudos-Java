package com.brunodev.estudos.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest {
    // O metodo .relativize() serve para descobrir o caminho que conecta dois endereços, ou seja, ele responde à pergunta: "Como eu chego do Ponto A até o Ponto B?".

    static void main(String[] args) {
        Path dir = Paths.get("/home/bruno");
        Path clazz = Paths.get("/home/bruno/lindo/amoroso/bonito.eElegante");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto1 = Paths.get("/home/bruno");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/bruno/lindo/amoroso/bonito.eElegante");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.212");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("3 " + absoluto1.relativize(absoluto2));
        System.out.println("4 " + relativo1.relativize(relativo2));
        //System.out.println("5 " + absoluto1.relativize(relativo1)); Lança uma exceção, pois do absoluto1 para o relativo1 o java não sabe aonde esse dir (temp) está, pois ele é um caminho relativo.
    }
}
