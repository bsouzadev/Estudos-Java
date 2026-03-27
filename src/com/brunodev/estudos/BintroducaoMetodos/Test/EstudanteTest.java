package com.brunodev.estudos.BintroducaoMetodos.Test;

import com.brunodev.estudos.BintroducaoMetodos.dominio.Estudante;
import com.brunodev.estudos.BintroducaoMetodos.dominio.ImprimeEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        // duas variaveis de referencias que fazem referencias a dois objetos:
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        // variavel de referencia que faz referencia a um objeto:
        ImprimeEstudante imprimeEstudante = new ImprimeEstudante();

        estudante1.nome = "Afonso";
        estudante1.idade = 3;
        estudante1.sexo = 'M';

        estudante2.nome = "Andre";
        estudante2.idade = 13;
        estudante2.sexo = 'M';

        // passagem por valor (cópia da referência do objeto)
        imprimeEstudante.imprime(estudante1); // estudante1 aponta para o objeto.
        imprimeEstudante.imprime(estudante2);

        /*
         * estudante1 já aponta para um objeto na memória.
         * Esse "endereço" (referência) é passado para o método.
         * Dentro do método, estudante aponta para o mesmo objeto
         */

        System.out.println("---------");
        imprimeEstudante.imprime(estudante1);
        imprimeEstudante.imprime(estudante2);
    }
}
