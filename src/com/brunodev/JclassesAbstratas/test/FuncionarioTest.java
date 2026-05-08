package com.brunodev.JclassesAbstratas.test;

import com.brunodev.JclassesAbstratas.dominio.Desenvolvedor;
import com.brunodev.JclassesAbstratas.dominio.Funcionario;
import com.brunodev.JclassesAbstratas.dominio.Gerente;

public class FuncionarioTest {
    static void main(String[] args) {
        Funcionario gerente = new Gerente("Alan", 1521);
        Funcionario desenvolvedor = new Desenvolvedor("Brunão Dev", 26000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
