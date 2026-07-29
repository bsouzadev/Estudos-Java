package com.brunodev.estudos.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    static void main(String[] args) throws IOException {
        //File para diretórios:
        File fileDiretorio = new File("pasta"); //Essa variável de referência está apenas apontando para o caminho "pasta", ou seja, para o local onde você deseja acessar ou criar o diretório. Ela não cria a pasta sozinha.
        boolean isMkdirCriado = fileDiretorio.mkdir(); //Cria o diretório nesse caminho (endereço).
        System.out.println(isMkdirCriado);

        //Criando um arquivo dentro do diretório:
        File fileArquivoDiretorio = new File(fileDiretorio,"texto.txt"); //fileDiretorio é a variável de referência do nosso diretório aonde iremos criar o arquivo.
        boolean isArqCriado = fileArquivoDiretorio.createNewFile();
        System.out.println(isArqCriado);

        //Renomeando o nome do arquivo:
        File renameArquivo = new File(fileDiretorio,"arq_renomeado.txt"); //Novo nome do arq e adiciona ele dentro do diretório onde estava o arquivo antigo (sem rename).
        boolean rename = fileArquivoDiretorio.renameTo(renameArquivo);
        System.out.println(rename);

        //Renomeando o nome do diretório:
        File renameDiretorio = new File("pasta2");
        boolean renameDir = fileDiretorio.renameTo(renameDiretorio);
        System.out.println(renameDir);
    }
}
