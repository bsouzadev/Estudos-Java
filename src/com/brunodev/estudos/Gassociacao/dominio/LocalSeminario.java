package com.brunodev.estudos.Gassociacao.dominio;

public class LocalSeminario {
    private String endereco;

    //
    public LocalSeminario(String endereco) {
        this.endereco = endereco;
    }

    //
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //
    public String toString(){
        return getEndereco();
    }
}
