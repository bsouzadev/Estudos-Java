package com.brunodev.estudos.AintroducaoClasses.test;

import com.brunodev.estudos.AintroducaoClasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        //criando um objeto...
        Estudante estudante = new Estudante(); //objeto, variavel de referencia do tipo estudante, que faz referencia a um objeto do tipo estudante (respectivamente).
        //A classe Estudante define um tipo, e eu uso esse tipo para criar variáveis
        
        //colocando valores nos atributos: 
        estudante.idade = 19;
        estudante.nome = "Brunin dev junior";
        estudante.sexo = 'M';

        System.out.println(estudante.nome + "\n" + estudante.idade + "\n" + estudante.sexo);
        System.out.println("\nEndereço de memoria que estudante está apontando: " + estudante);
    }
}
