package com.brunodev.estudos.BintroducaoMetodos.Test;

import com.brunodev.estudos.BintroducaoMetodos.dominio.Estudante;

public class EstudanteTest2 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Afonso";
        estudante1.idade = 3;
        estudante1.sexo = 'M';

        estudante2.nome = "Andre";
        estudante2.idade = 13;
        estudante2.sexo = 'M';

        estudante1.imprime(); //não precisa de parametro, no metodo tem this, que é o objeto que está executando o método, no caso estudante1.
        estudante2.imprime();
    }
}
