package com.brunodev.estudos.EblocosInicializacao.dominio;

public class Anime {
    private String nome;
    private int ep[];

    // bloco de inicialização de instancia: É sempre o primeiro a ser executado, é executado todas as vezes que o objeto é criado.
    // é utilizado para não precisar ficar repetindo os codigos dentro dos construtores. 
    {
        ep = new int[100];
        for (int i = 0; i < 100; i++) {
            ep[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        /* //isso teria que ser replicado dentro do primeiro construtor. Com o bloco de inicialização, idependente do construtor que for chamado o objeto, o codigo abaixo ja estará inicializado.
         ep = new int[100];
         for (int i = 0; i < 100; i++) {
         ep[i] = i + 1;
        }
        */

        for (int ep : this.ep) {
            System.out.print(ep + " ");
        }
        System.out.println();
    }

    public int[] getEp() { // não retorna o array, e sim o endereço de memoria dele (referencia do array).
        return ep;
    }

    public String getNome() {
        return nome;
    }


    //ordem de quando se cria um objeto:
    //1 é alocado um espaço na memoria.
    //2 cada atributo da classe é criado e inicializado com valores de inicialização padrão, ou o que for passado.
    //3 bloco de inicialização é executado.
    //4 construtores.
}
