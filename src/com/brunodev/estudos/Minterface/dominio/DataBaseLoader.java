package com.brunodev.estudos.Minterface.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando arquivos do banco de dados");
    }

    @Override
    public void remover() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("OK");
    }

    public static void teste(){
        System.out.println("Dentro de DataBaseLoader");
    }
}
