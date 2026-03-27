package com.brunodev.estudos.AintroducaoClasses.test;

import com.brunodev.estudos.AintroducaoClasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Eduards";
        professor.idade = 120;
        professor.sexo = 'M';

        System.out.println(professor.idade + " " + professor.nome + " " + professor.sexo);
    }
}