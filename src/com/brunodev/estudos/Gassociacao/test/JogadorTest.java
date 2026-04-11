package com.brunodev.estudos.Gassociacao.test;

import com.brunodev.estudos.Gassociacao.dominio.Jogador;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("bruno rodrigues");
        Jogador jogador2 = new Jogador("macaé");
        Jogador jogador3 = new Jogador("taciano");

        Jogador[] jogadores = new Jogador[3];
        jogadores[0] = jogador1; //aponta para jogador1 
        jogadores[1] = jogador2;
        jogadores[2] = jogador3;

        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].imprime();
        }

        //usando foreach
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}