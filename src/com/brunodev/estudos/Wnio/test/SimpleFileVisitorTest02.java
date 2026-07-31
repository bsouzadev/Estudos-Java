package com.brunodev.estudos.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class SimpleFileVisitorTest02 {
    static void main(String[] args) throws IOException {
        //Serve para navegar por pastas e arquivos de forma fácil. Ele ajuda a percorrer árvores de diretórios, permitindo que você escolha quais ações tomar ao encontrar um arquivo ou uma pasta, sem precisar escrever todo o código de navegação do zero.

        Path path = Paths.get("pasta");
        Files.walkFileTree(path, new ListAllFiles()); //Nos parâmetros precisa de um path para começar a procurar e o comportamento do que se quer fazer navegando por esses diretórios.
    }
}

class ListAllFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        System.out.println(file.getFileName());

        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException { //Imprime quando entra em um diretório.
        System.out.println("pre visit " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("post visit " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}
