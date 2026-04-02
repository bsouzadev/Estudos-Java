package com.brunodev.estudos.Dconstrutores.test;

import com.brunodev.estudos.Dconstrutores.dominio.Anime;

public class AnimeTest1 {
    public static void main(String[] args) {
        Anime anime = new Anime("Mangá", "Osvald Cruz", 1231, "Terrorzão", "WB");
        anime.imprime();
    }
}