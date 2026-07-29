package com.brunodev.estudos.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    static void main(String[] args) {
        //Path, Paths, Files viram para substituir a antiga classe File. E elas trabalham juntas (Path, Paths, Files).


        //Formas de pegar um arquivo:
        Path p1 = Paths.get("C:\\Users\\User\\Documents\\Estudos-em-java\\Java\\src\\com\\brunodev\\estudos\\file.txt");
        Path p2 = Paths.get("C:\\Users\\User\\Documents\\Estudos-em-java\\Java\\src\\com\\brunodev\\estudos","file.txt");
        Path p3 = Paths.get("C:", "Users\\User\\Documents\\Estudos-em-java\\Java\\src\\com\\brunodev\\estudos", "file.txt");
        Path p4 = Paths.get("C:", "Users", "User", "Documents", "Estudos-em-java", "Java", "src", "com", "brunodev", "estudos", "file.txt");

        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());

    }
}


//📍 Path (A Interface) Representa o caminho do arquivo ou pasta. É apenas o endereço (ex: "C:/usuarios/documento.txt"). Não lê e não escreve dados no disco. Substitui o antigo java.io.File.

// 🛠️ Paths (A Classe Utilitária de Criação) Serve apenas para criar um objeto Path. Traduz textos em um caminho real. Usa o metodo estático Paths.get(). Nota: No Java moderno, você também pode usar Path.of().

//  🗄️ Files (A Classe de Operações) Contém os métodos práticos para manipular arquivos. Lê, escreve, copia, move e deleta. Todos os seus métodos são estáticos. Recebe um Path como argumento para saber onde agir.