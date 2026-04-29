package com.brunodev.estudos.Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores){
        this(nome);
        this.jogadores = jogadores;
    }

    public void imprime(){
        if(jogadores == null) return;
        for (int i = 0; i < this.jogadores.length; i++) {
            System.out.println("Os jogadores de " + getNome() + ": " + this.jogadores[i].getNome());
        }
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}