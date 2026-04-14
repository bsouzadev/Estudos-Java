package com.brunodev.estudos.Hheranca.test;

import com.brunodev.estudos.Hheranca.dominio.Endereco;
import com.brunodev.estudos.Hheranca.dominio.Funcionario;
import com.brunodev.estudos.Hheranca.dominio.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("rua 32");
        endereco.setCep("12313-12");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("alfredo");
        pessoa.setCpf("321323");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("alemão");
        funcionario.setCpf("23131-33");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("----");

        
        funcionario.imprime();
    }
}
 