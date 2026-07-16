package com.brunodev.estudos.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest2 {
    static void main() throws IOException{
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException{

        File file = new File("Arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}

//Se o metodo é privado é melhor usar um try catch para tratar a exceção.
//Se o metodo é publico é melhor usar o throws.