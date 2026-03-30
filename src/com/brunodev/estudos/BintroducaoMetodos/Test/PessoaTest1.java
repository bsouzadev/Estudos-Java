package com.brunodev.estudos.BintroducaoMetodos.Test;

import com.brunodev.estudos.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTest1 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Brunão");
        pessoa.setIdade(76);
        
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());
        //pessoa.imprime();
    }
}
