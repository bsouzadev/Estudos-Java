package com.brunodev.estudos.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class); //Criando um objeto do tipo basicFileAttributes. readAttributes retorna o que eu passar como objeto (que no caso foi BasicFileAttributes.class).

        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccessTime = basicFileAttributes.lastAccessTime();

        System.out.println("creationTime " + creationTime);
        System.out.println("lastModifiedTime " + lastModifiedTime);
        System.out.println("lastAccessTime " + lastAccessTime);
        System.out.println("----------");

        //Alterando um dado utilizando as classes do pacote attribute. As classes que dão essa possibilidade de alterar alguns atributos terminam com view (BasicFileAttributesView, DosFileAttributesView, PosixFileAttributesView):

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime fileTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime,fileTime,creationTime); //Modificando a última data de acesso para agora

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("creationTime " + creationTime);
        System.out.println("lastModifiedTime " + lastModifiedTime);
        System.out.println("lastAccessTime " + lastAccessTime);

    }
}

// BasicFileAttributes, DosFileAttributes, PosixFileAttributes servem para ler metadados (dados sobre dados. É a informação que explica o que é um arquivo, sem ser o conteúdo dele em si.) e propriedades específicas de arquivos e diretórios diretamente do sistema de arquivos.

// BasicFileAttributes: Funciona em qualquer sistema. Mostra o básico: tamanho, data de criação, modificação e se é uma pasta ou arquivo.
// DosFileAttributes: Feito para Windows. Mostra se o arquivo é oculto, somente leitura, de sistema ou arquivo morto.
// PosixFileAttributes: Feito para Linux e macOS. Mostra o dono do arquivo, o grupo e as permissões de leitura/escrita (rwxrwxrwx).