package com.brunodev.estudos.LclassesAbstratas.test;

import com.brunodev.estudos.LclassesAbstratas.dominio.Desenvolvedor;
import com.brunodev.estudos.LclassesAbstratas.dominio.Funcionario;
import com.brunodev.estudos.LclassesAbstratas.dominio.Gerente;

public class FuncionarioTest {
    static void main(String[] args) {
        Funcionario gerente = new Gerente("Alan", 1521);
        Funcionario desenvolvedor = new Desenvolvedor("Brunão Dev", 26000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
