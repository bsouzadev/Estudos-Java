package com.brunodev.estudos.Wnio.test;

import java.nio.file.*;

public class PathMatcherTest {
    static void main(String[] args) {
        //Serve para comparar caminhos de arquivos e pastas usando padrões de texto específicos, como expressões regulares ou sintaxe glob.

        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");

        matches(path1, "glob:**/*.bkp"); //Verifica se tem algum arq com a extensão .bkp.
        matches(path1, "glob:**/*.{bkp,txt,java}"); //Verifica se tem algum arq com a extensão .bkp ou txt, ou java. (**/*) ignora todo diretório que tem para trás e todo nome de arquivo.
        matches(path2, "glob:**/*.{bkp,txt,java}");
        matches(path3, "glob:**/*.{bkp,txt,java}");
        matches(path1, "glob:**/*.???"); //Verifica se tem algum arquivo com 3 letras na extensão. (**/*) não me importo com diretório e nem nome, só quero saber se tem algum arquivo com 3 letras na extensão.
        matches(path2, "glob:**/*.???");
        matches(path3, "glob:**/*.???");
        matches(path3, "glob:**/file.????"); //Verifica se tem algum arquivo com o nome file e tem que terminar com 3 letras na extensão.
    }

    private static void matches(Path path, String glob){
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + pathMatcher.matches(path));
    }
}
