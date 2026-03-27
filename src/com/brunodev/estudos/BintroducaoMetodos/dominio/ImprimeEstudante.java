package com.brunodev.estudos.BintroducaoMetodos.dominio;

public class ImprimeEstudante {

    /*
     * Primitivos → copia o valor
     * Objetos → copia a referência
     */

    // metodo:
    public void imprime(Estudante estudante) { // recebendo uma copia de referencia de um objeto (apontam para o mesmo objeto).
        // estudante é uma variável que aponta para um objeto Estudante na memória.
        System.out.println("--------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);

        estudante.nome = "Jurandir"; // mudando o valor do objeto via referencia
    }
}