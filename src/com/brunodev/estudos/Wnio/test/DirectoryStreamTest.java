package com.brunodev.estudos.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest {
    static void main(String[] args) {
        //Serve para listar os arquivos e pastas de um diretório de forma eficiente, usando pouca memória e permitindo o uso do laço for-each.
        Path dir = Paths.get("."); //. Significa que estamos passando o caminho do nosso diretório atual.

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            for(Path path : stream){
                System.out.println(path.getFileName());
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

//DirectoryStream<Path> vai ter um Path para cada arq que for encontrado dentro da pasta que estamos (estudos) passado o caminho inicial dentro de Files.newDirectoryStream(dir).
