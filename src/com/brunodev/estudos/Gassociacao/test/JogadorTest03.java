package com.brunodev.estudos.Gassociacao.test;

import com.brunodev.estudos.Gassociacao.dominio.Jogador;
import com.brunodev.estudos.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cr7");
        Jogador jogador2 = new Jogador("Bobby");
        Time time = new Time("Portugal");
        Time time2 = new Time( "Manchester United");
        Jogador[] jogadores = { jogador, jogador2 };

        jogador.setTime(time);
        jogador2.setTime(time2);
        time.setJogadores(jogadores);

        System.out.println("=== Jogador ===");

        jogador.imprime();
        jogador2.imprime();

        System.out.println("=== Time ===");

        time.imprime();
        time2.imprime();
    }
}
