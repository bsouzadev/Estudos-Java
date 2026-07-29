package com.brunodev.estudos.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
    static void main(String[] args) {
        //Para escrever em arq muito grande e querendo desempenho se usa a classe BufferedWriter.
        File file = new File("file.txt");

        try(FileWriter fw = new FileWriter(file,true); BufferedWriter bw = new BufferedWriter(fw)) { //É necessário fechar o arquivo quando se trabalha com leitura e escrita nos arq. Esse true significa que ele não vai apagar tudo e escrever novamente e sim, adicionar.
            bw.write("Hoje eu estou aprendendo a escrever em um arquivo! Irei me tornar um programador renomeado, ter uma empresa, ganhar muito dinheiro, e ser um mantedor da obra de Deus. Toda honra e gloria seja dada a Ele! Sem ele nada do que eu sou hoje seria possível!"); //Escrevendo em um arq.
            bw.newLine(); //Pula de linha conforme o SO (nem todos aceitam \n).
            bw.write("Amem!");
            bw.flush(); //Importante colocar isso para o que foi escrito no arq ficar realmente escrito (tira o ‘buffer’).

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
