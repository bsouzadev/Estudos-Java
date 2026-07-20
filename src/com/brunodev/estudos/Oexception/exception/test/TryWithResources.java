package com.brunodev.estudos.Oexception.exception.test;

import com.brunodev.estudos.Oexception.exception.dominio.Leitor1;
import com.brunodev.estudos.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResources {
    static void main(String[] args) {
        lerArq();
    }

    public static void lerArq(){
        try (Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) { //dentro do parâmetro se declara a variável e instancia o objeto. E ela está se encarregando de fechar essa variável de referencia. Lembrando que essas classes precisam implementar a interface Closeable ou AutoCloseable.

        } catch (IOException e) { //Quando se usa o tryWithResources se pode deixar somente o try. Mas é obrigado a utilizar o throws e a exceção que está a ser lançada.
            e.printStackTrace();
        }
    }

    public static void lerArq2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
