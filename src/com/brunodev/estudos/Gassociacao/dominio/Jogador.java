package com.brunodev.estudos.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime(){
        System.out.print("O jogador " + this.nome);
        if(time != null){
            System.out.print(" pertence ao time: " + time.getNome() + "\n");
        }
    }

    public Jogador(String nome){
        this.nome = nome;
    }

    //
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
