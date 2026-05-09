package com.brunodev.estudos.Minterface.test;

import com.brunodev.estudos.Minterface.dominio.DataBaseLoader;
import com.brunodev.estudos.Minterface.dominio.DataLoader;
import com.brunodev.estudos.Minterface.dominio.FileLoader;

public class DataLoaderTest {
    static void main() {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remover();
        fileLoader.remover();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();


        DataLoader.teste();
        DataBaseLoader.teste();
    }
}
