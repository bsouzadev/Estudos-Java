package com.brunodev.estudos.Wnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest {
    static void main(String[] args) {
        //ZipOutputStreamTest serve para gerar um zip:

        Path arqZip = Paths.get("pasta/arquivo.zip"); //Nome do arq que iremos criar.
        Path arqParaZipar = Paths.get("pasta/subpasta1/subsubpasta1");//Localização

    }

    private static void zip(Path arqZip, Path arqParaZipar){
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arqZip)); DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arqParaZipar)) {
            for (Path file : directoryStream){
                ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                zipStream.putNextEntry(zipEntry);
                Files.copy(file, zipStream);
                zipStream.closeEntry();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
