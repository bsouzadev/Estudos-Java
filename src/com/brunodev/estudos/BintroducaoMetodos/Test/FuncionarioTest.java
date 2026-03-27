package com.brunodev.estudos.BintroducaoMetodos.Test;

import com.brunodev.estudos.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario fun = new Funcionario();
        fun.idade = 75;
        fun.nome = "Alfredo";
        fun.salario[0] = 5100.2f;
        fun.salario[1] = 5300.2f;
        fun.salario[2] = 5500.2f;

        fun.imprimeDados();
        fun.mediaSalario();
    }
}
