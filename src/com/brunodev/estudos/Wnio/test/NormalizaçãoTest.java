package com.brunodev.estudos.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizaçãoTest {

    static void main(String[] args) {
        //Normalização (.normalize()) Serve para limpar o endereço de um arquivo, eliminando atalhos desnecessários.

        String diretorioDoProjeto = "homeNio/bruno/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path = Paths.get(diretorioDoProjeto, arquivoTxt);
        System.out.println(path);
        System.out.println(path.normalize());

        Path path2 = Paths.get("/homeNio/./bruno/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
