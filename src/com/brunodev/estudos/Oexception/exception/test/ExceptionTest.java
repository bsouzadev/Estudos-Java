package com.brunodev.estudos.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
    static void main() {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("Arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}