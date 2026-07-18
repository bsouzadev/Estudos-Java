package com.brunodev.estudos.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest2 {
    static void main() throws IOException{ //foi deixado isso aqui somente para fins de estudos.
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException{

        File file = new File("Arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e; //se tem a possibilidade de relançar a exceção para o metodo main tratar ela de uma forma diferente.
        }
    }
}

//Se o metodo é privado é melhor usar um try catch para tratar a exceção.
//Se o metodo é publico é melhor usar o throws.