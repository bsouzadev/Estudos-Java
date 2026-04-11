package com.brunodev.estudos.Gassociacao.test;

import com.brunodev.estudos.Gassociacao.dominio.Jogador;
import com.brunodev.estudos.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("zé ivaldo");
        Time time = new Time("Barcemlona");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
