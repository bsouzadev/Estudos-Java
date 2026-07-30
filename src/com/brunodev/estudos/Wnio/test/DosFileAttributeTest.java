package com.brunodev.estudos.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTest {
    static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/test.txt");

        if(Files.notExists(path)) Files.createFile(path);

        //Alterando os atributos através da Files.
        Files.setAttribute(path,"dos:hidden", true); //Deixando o test.txt como um arquivo oculto.
        Files.setAttribute(path,"dos:readonly", true); //Deixando o test.txt como um arquivo somente para leitura.

        //Voltando o arquivo para desoculto e tirando ele do modo leitura:
        Files.setAttribute(path,"dos:hidden", false);
        Files.setAttribute(path,"dos:readonly", false);

        //Alterando os atributos através da DosFileAttribute:
        //Utilizando DosFileAttribute para saber se o arquivo é oculto ou somente para leitura:
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden());
        System.out.println(dosFileAttributes.isReadOnly());

        //Fazendo uma alteração através da DosFileAttribute:
        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);
    }
}
