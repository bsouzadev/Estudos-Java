package com.brunodev.estudos.CsobreCargaMetodos.dominio;

//sobrecarga de metodos: é ter o metodo com o mesmo nome e o tipo/quantidade dos parametros são diferentes.
//sobrecarga melhora a escala
public class Anime {
    private String tipo;
    private int episodios;
    private String genero;
    private String nome;


    public void init(String tipo, String nome, int episodios){
        this.tipo = tipo;
        this.nome = nome;
        this.episodios = episodios;
    }

    public void init(String tipo, String nome, int episodios, String genero){
        this.init(tipo, nome, episodios);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.nome);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    //
    public String getNome(){
        return nome;
    }

    public String getGenero(){
        return genero;
    }
    
    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

}
