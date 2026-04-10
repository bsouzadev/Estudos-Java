package com.brunodev.estudos.FmodificadorEstatico.Dominio;

//static = indica que um membro (variável, método ou classe interna) pertence à classe em si, e não a instâncias (objetos) específicas.
public class Carro {
    private String nome;
    private double velocidadeMax;
    private static double velocidadeLim = 250; // modificador statico, é um modificador que faz com que algo pertença à classe e não ao *objeto*, e todos as instancias vão compartilhar do mesmo valor.

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void imprime() {
        System.out.println("----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMax);
        System.out.println("Velocidade limite: " + Carro.velocidadeLim); //O this é usado para referenciar o objeto atual (instância da classe). E não faz sentido colocar this, pois velocidade é static, ou seja é um atributo que pertence a classe e não depende de um objeto para ser acessado, se acessa pela propia classe.  
    }

    public String getNome() {
        return nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //criando metodos estaticos:
    public static void setVelocidadeLim(double velocidadeLim){ //velocidade limite é um atributo que pertence a classe.
        Carro.velocidadeLim = velocidadeLim;

        // Não se pode usar "this.velocidadeLim = velocidadeLim"
        // porque "this" faz referência a um objeto (instância).
        // Como o método e o atributo são static, eles pertencem à classe,
        // não a um objeto específico. Portanto, não é garantido que exista
        // uma instância para usar "this".

        // Não se pode usar, dentro de métodos estáticos, variáveis não estáticas,
        // pois, para o método estático acessar uma variável não estática,
        // seria necessário um objeto. E esse objeto pode ainda não ter sido criado.

        // Mas é possível usar variáveis estáticas dentro de métodos não estáticos,
        // pois atributos estáticos pertencem à classe e existem independentemente de objetos.

        // Cria-se um método estático quando ele não depende de nenhum dado específico
        // de um objeto da classe.

        //os membros estáticos (métodos e atributos) pertencem à classe, não à instância (objeto). Isso significa que eles são carregados quando a classe é carregada pela primeira vez, antes mesmo de qualquer objeto ser instanciado.

        //Atributos de instância = pertencem a cada objeto (únicos por objeto). 
        //Atributos estáticos (usando a palavra-chave static) = pertencem à classe, compartilhando o mesmo valor entre todos os objetos. 
        //Atributos de instância são criados via new, e estáticos existem antes de qualquer objeto.
    }

    public static double getVelocidadeLim(){
        return Carro.velocidadeLim;
    }
}
