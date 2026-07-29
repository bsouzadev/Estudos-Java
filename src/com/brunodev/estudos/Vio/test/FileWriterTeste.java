package com.brunodev.estudos.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste {
    static void main(String[] args) {
        File file = new File("file.txt");

        try(FileWriter fw = new FileWriter(file,true)) { //É necessário fechar o arquivo quando se trabalha com leitura e escrita nos arq. Esse true significa que ele não vai apagar tudo e escrever novamente e sim, adicionar.
            fw.write("Hoje eu estou aprendendo a escrever em um arquivo! Irei me tornar um programador renomeado, ter uma empresa, ganhar muito dinheiro, e ser um mantedor da obra de Deus. Toda honra e gloria seja dada a Ele! Sem ele nada do que eu sou hoje seria possível!\n"); //Escrevendo em um arq.
            fw.flush(); //Importante colocar isso para o que foi escrito no arq ficar realmente escrito (tira o ‘buffer’).

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
