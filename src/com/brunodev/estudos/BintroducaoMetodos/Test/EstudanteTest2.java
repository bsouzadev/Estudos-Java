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

        estudante1.imprime(); //através do this: acessa os dados do objeto que chamou o método
        estudante2.imprime();
    }
}
