package com.brunodev.estudos.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class SimpleFileVisitorTest {
    static void main(String[] args) throws IOException {
        //Serve para navegar por pastas e arquivos de forma fácil. Ele ajuda a percorrer árvores de diretórios, permitindo que você escolha quais ações tomar ao encontrar um arquivo ou uma pasta, sem precisar escrever todo o código de navegação do zero.

        Path path = Paths.get(".");
        Files.walkFileTree(path, new ListAllFiles()); //Nos parâmetros precisa de um path para começar a procurar e o comportamento do que se quer fazer navegando por esses diretórios.
    }
}

class ListAllFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if(file.getFileName().toString().endsWith(".java")){
            System.out.println(file.getFileName());
        }

        return FileVisitResult.CONTINUE;
    }
}
