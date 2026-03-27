
package com.brunodev.estudos.BintroducaoMetodos.dominio;

public class Funcionario {
    public int idade;
    public String nome;
    public float salario[] = new float[3];

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (int i = 0; i < salario.length; i++) {
            System.out.println(this.salario[i]);
        }
    }

    public void mediaSalario() {
        float media = 0;
        for (int i = 0; i < this.salario.length; i++) {
            media += this.salario[i];
        }

        System.out.println(media /= this.salario.length);
    }
}
