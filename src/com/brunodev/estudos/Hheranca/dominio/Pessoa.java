package com.brunodev.estudos.Hheranca.dominio;

public class Pessoa {
    protected String nome; //protected: acessível na própria classe, subclasses e mesmo pacote
    protected String cpf;
    protected Endereco endereco;

    static{
        System.out.println("Dentro do bloco de inicialização estático de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de pessoa2");
    }


    //
    public Pessoa(String nome){
        this.nome = nome;
        System.out.println("Dentro do construtor de pessoa ");
    }

    public Pessoa(String nome, String cpf){
        System.out.println("Dentro do construtor de pessoa ");
        this(nome);
        this.cpf = cpf;
    }
    //
    public void imprime() {
        System.out.println(this.getCpf()); //o this irá fazer ref, para o metodo que chamou.
        System.out.println(this.getNome());
        System.out.println(this.getEndereco().getRua() + " " + this.getEndereco().getCep());
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
