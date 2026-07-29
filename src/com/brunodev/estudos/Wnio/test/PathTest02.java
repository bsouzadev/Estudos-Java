package com.brunodev.estudos.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    static void main(String[] args) throws IOException {

        //Criando uma pasta (passando o caminho):
        Path pastaPath = Paths.get("pasta"); //Equivalente a new File ("pasta");

        if (Files.notExists(pastaPath)){ //Verifica se o diretorio/arq existe.

            //Criando a pasta com base no caminho passado:
            Path pastaDiretorio = Files.createDirectory(pastaPath);
        }

        //Para criar com múltiplos diretórios:
        Path subPastasPath = Paths.get("pasta/subpasta/subsubpasta");
        Path pastaDiretorios = Files.createDirectories(subPastasPath);

        //Para criar um arquivo:
        Path filePath = Paths.get(subPastasPath.toString(), "file.txt"); //Cria um arq dentro de subsubpasta. O .toString() retorna o caminho em formato de string (pasta/subpasta/subsubpasta). E cria o arq file.txt dentro de subsubpasta.

        if (Files.notExists(filePath)){ //Verifica se o diretorio/arq existe.

            //Criando o arquivo com base no caminho passado:
            Path filePathCriado = Files.createFile(filePath);
        }

        //Copiando e renomeando um arq:
        Path origem = filePath;
        Path destino = Paths.get(filePath.getParent().toString(), "file_rename.txt");
        Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
    }
}