package com.brunodev.estudos.Vio.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    static void main(String[] args) {
        File file = new File("file.txt");

        try (FileReader fr = new FileReader(file)){
            //System.out.println(fr.read()); .read retorna um inteiro que representa o número da tabela ASCII do primeiro carácter.

            //Para ler um arq inteiro:
            int i;
            while ((i=fr.read()) != -1){ //-1 significa que o arquivo acabou (não tem mais palavras para serem lidas).
                System.out.print((char)i); //Faz um cast para char, pois na variável i tem um número que representa uma letra conforme a tabela ASCII.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
