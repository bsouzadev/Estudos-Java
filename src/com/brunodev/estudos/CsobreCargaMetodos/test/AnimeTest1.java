package com.brunodev.estudos.CsobreCargaMetodos.test;

import com.brunodev.estudos.CsobreCargaMetodos.dominio.Anime;

public class AnimeTest1 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //anime.init("TV", "Hora do rush", 99);
        anime.init("TV", "Hora do rush", 99);
        anime.imprime();

    }
}