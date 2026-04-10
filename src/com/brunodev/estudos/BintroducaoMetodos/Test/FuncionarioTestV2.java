package com.brunodev.estudos.BintroducaoMetodos.Test;

import com.brunodev.estudos.BintroducaoMetodos.dominio.FuncionarioV2;

public class FuncionarioTestV2 {
    public static void main(String[] args) {
        FuncionarioV2 fun = new FuncionarioV2();
        fun.setNome("Xabi Alonso");
        fun.setIdade(79);
        fun.setSalario(new float[]{1621.29f, 1621.29f, 1621.29f});

        fun.imprimeDados();

        System.out.println("==== Imprimindo na main ====");
        
        for(float i : fun.getSalario()){
            System.out.println(i);
        }
    }
}
