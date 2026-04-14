package com.brunodev.estudos.Hheranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    //
    /*
     * public Pessoa(String nome, String cpf, Endereco endereco){
     * this.cpf = cpf;
     * this.endereco = endereco;
     * this.nome = nome;
     * }
     */
    
    //
    public void imprime() {
        System.out.println(getCpf());
        System.out.println(getNome());
        System.out.println(getEndereco().getRua() + " " + getEndereco().getCep());
    }

    //
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }
}
