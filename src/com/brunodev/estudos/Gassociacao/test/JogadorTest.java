package com.brunodev.estudos.Gassociacao.test;

import com.brunodev.estudos.Gassociacao.dominio.Jogador;
import com.brunodev.estudos.Gassociacao.dominio.Time;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("bruno rodrigues");
        Jogador jogador2 = new Jogador("macaé");
        Jogador jogador3 = new Jogador("taciano");


        Jogador[] jogadores = new Jogador[3];
        jogadores[0] = jogador1; //aponta para jogador1 
        jogadores[1] = jogador2;
        jogadores[2] = jogador3;

        Time time = new Time("Os bons de bola",jogadores);
        Time time2 = new Time("Flamengo");

        jogador1.setTime(time2);
        System.out.println("--");
        jogador1.imprime();


        System.out.println("Jogadores do time: " + time.getNome());
        time.imprime();


        System.out.println("---- Imprimindo jogadores, teste ----");
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].imprime();
        }

        //usando foreach
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}