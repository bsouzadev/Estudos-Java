package com.brunodev.estudos.Gassociacao.dominio;

//muitos para um
public class Escola {
    private String nome;
    private Professor[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this(nome);
        this.professores = professores;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (professores == null)
            return;
        for (int i = 0; i < professores.length; i++) {
            System.out.println(professores[i].getNome());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
