package com.brunodev.estudos.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class PathMatcherTest02 {
    static void main(String[] args) throws IOException {
        //Pequeno exercício: utilizando a PathMatcher e a SimpleFileVisitor retorne todos os aqr do diretório estudo que tenham test no nome e que tenham a extensão .java ou .class.

        Path diretorioAtual = Paths.get(".");
        Files.walkFileTree(diretorioAtual, new javaLista());
    }

}

class javaLista extends SimpleFileVisitor<Path>{
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (matcher.matches(file)){
            System.out.println(file.getFileName());
        }

        return FileVisitResult.CONTINUE;
    }
}
