package com.brunodev.estudos.Gassociacao.dominio;

public class AlunoSeminario {
    private String nome;
    private int idade;
    private Seminario seminario;

    //
    public AlunoSeminario (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public AlunoSeminario (String nome, int idade, Seminario seminario) {
        this(nome, idade);
        this.seminario = seminario;
    }

    //
    public void imprime(){
        System.out.println("Informações do Aluno: " + getNome() + "\nIdade: " + getIdade());
        if(seminario == null) return;
        System.out.println("Seminário cadastrado: " + getSeminario().getTitulo());
    }

    //
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
