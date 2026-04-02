package com.brunodev.estudos.AintroducaoClasses.test;

import com.brunodev.estudos.AintroducaoClasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        //criando um objeto...
        Estudante estudante = new Estudante(); // Cria um objeto do tipo Estudante (new) e armazena sua referência na variável estudante.
        //Class Estudante cria um tipo. Estudante estudante cria uma variavel desse tipo, new estudante cria o objeto na memoria. 
        //A classe define um tipo, que pode ser usado para declarar variáveis, e através do new, criar objetos.
        
        // Atribuindo valores aos atributos do objeto
        estudante.idade = 19;
        estudante.nome = "Brunin dev junior";
        estudante.sexo = 'M';

        System.out.println(estudante.nome + "\n" + estudante.idade + "\n" + estudante.sexo);
        System.out.println("\nEndereço de memoria que estudante está apontando: " + estudante);
    }
}
