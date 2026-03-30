
package com.brunodev.estudos.BintroducaoMetodos.dominio;

public class FuncionarioV2 {
    //nem todos os atributos da classe serão acessados, por exemplo media. Nesse caso não é nescessario fazer um set nela.
    private int idade;
    private String nome;
    private float salario[];
    private float media;

    //metodos:
    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (int i = 0; i < salario.length; i++) {
            System.out.print(this.salario[i] + " ");
        }
        System.out.println();

        mediaSalario();
    }

    private void mediaSalario() {
        System.out.println("Media salarial: ");
        for (int i = 0; i < this.salario.length; i++) {
            media += this.salario[i];
        }
        System.out.println(media /= this.salario.length);
    }

    // metodos set:
    public void setIdade(int idade) {
        if (idade >= 0)
            this.idade = idade;

        System.out.println("Idade invalida!");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float[] salario) {
        this.salario = salario;
    }

    // metodos get;
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public float[] getSalario() {
        return salario;
    }

    public float getMedia() {
        return media;
    }

}
