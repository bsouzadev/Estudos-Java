package com.brunodev.estudos.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    static void main(String[] args) {
        File file = new File("file.txt");

        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)){

            String linha;
            while ((linha = br.readLine()) != null) { //.readLine le uma linha inteira, e retorna null quando chega no final do arq.
                System.out.println(linha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
