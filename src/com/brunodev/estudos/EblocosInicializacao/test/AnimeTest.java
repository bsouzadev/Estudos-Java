package com.brunodev.estudos.EblocosInicializacao.test;

import com.brunodev.estudos.EblocosInicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args){
        Anime anime = new Anime("Renan thomos");
        System.out.println(anime.getEp());
        Anime an = new Anime();

        System.out.println("Na main ====");
        for(int ep : anime.getEp()){
            System.out.print(ep + " ");
        }
    }
}
