package com.brunodev.estudos.CsobreCargaMetodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String genero;
    private String nome;

    public void init(String tipo, String nome, int episodios) {
        this.tipo = tipo;
        this.nome = nome;
        this.episodios = episodios;
    }

    public void init(String tipo, String nome, int episodios, String genero) {
        this.init(tipo, nome, episodios); //esse this serve para: Chamar o OUTRO método init desse mesmo objeto.
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.nome);
    }

    // setter = definir (atribuir) um valor ao atributo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // getter = retornar (pegar) o valor do atributo
    public String getNome() {
        return this.nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getEpisodios() {
        return this.episodios;
    }

}
