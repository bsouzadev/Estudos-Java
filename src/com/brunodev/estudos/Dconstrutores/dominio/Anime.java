package com.brunodev.estudos.Dconstrutores.dominio;


//sobrecarga construtores: é vários construtores na mesma classe, mas com parâmetros diferentes. Ou seja, se pode criar os objetos de formas diferentes.
//sobrecarga melhora a escala
public class Anime {
    private String tipo;
    private int episodios;
    private String genero;
    private String nome;
    private String estudio;

    // metodo construtor = é um método especial usado para criar e inicializar um objeto.
    // inicializa o objeto após sua criação com 'new', ou seja, inicializa o objeto pronto para o uso.
    public Anime(String tipo, String nome, int episodios, String genero) { //cria um metodo construtor com os parametros selecionados.
        //a chamada para outro construtor deverá ser feita na primeira linha.
        //this(); //sintaxe para chamar outro construtor (só consegue chamar por esse sintexe dentro do construtor. Irá chamar o construtor vazio, porque não tem metodos no this e nem no construtuor vazio).
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String tipo, String nome, int episodios, String genero, String estudio){
        this(tipo, nome, episodios, genero); //chama o construtor que tem esses 4 parametros.
        this.estudio = estudio;
    }

    public Anime(){ //Construtor vazio: permite criar o objeto sem passar valores (aqui é feita uma sobrecarga).
        //poderia ter aqui por exemplo, um construtor com valor pre definidos:
        //this.nome = "Gullit".
        //o objeto ja iria nascer com esse atributo pre selecionado.

        //ou simplesmente ter um metodo vazio Pulblic Anime(){ ... }.
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.estudio);
    }

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

    //
    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

}
