package com.brunodev.estudos.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.TemporalField;

public class BasicFileAttributesTest {
    static void main(String[] args) throws IOException {
        //Alterando a data em que o arquivo foi modificado através da classe FILE.
        LocalDateTime date = LocalDateTime.now().minusDays(10); //Data de hoje -10 dias.
        File file = new File("pasta2/novo.txt");
        boolean isCreadNewFile = file.createNewFile();
        boolean isModificado = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        //Alterando a data em que o arquivo foi modificado através da classe PATH.
        Path path = Paths.get("pasta2/novo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path,fileTime);
    }
}
