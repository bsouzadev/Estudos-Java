package com.brunodev.estudos.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    static void main(String[] args) {
        File file = new File("file.txt"); //Tem duas possibilidades de criar um arquivo. Se quiser criar o arq aonde o progama esta sendo executado se faz "file.txt". Mas se quiser salvar ele num local específico precisa passar o caminho absoluto.
        try {
            boolean newFile = file.createNewFile(); //Cria um arq.
            System.out.println("Criado: " + newFile);
            boolean exists = file.exists();//Verifica se o arq existe.
            System.out.println("Existente: " + exists);
            System.out.println("Path : " + file.getPath());
            System.out.println("Path caminho absoluto: " + file.getAbsoluteFile());
            System.out.println("is directory: " + file.isDirectory());
            System.out.println("is file: " + file.isFile());
            System.out.println("is hidden: " + file.isHidden()); //Verifica se o arq é oculto.
            System.out.println("Last modified: " + new Date(file.lastModified())); //Quando o arq foi modificado (colocar a date porque lastModified retorna milliseconds).

            if (exists) {
                System.out.println("Deletado: " + file.delete()); //Exclui um arq.
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
