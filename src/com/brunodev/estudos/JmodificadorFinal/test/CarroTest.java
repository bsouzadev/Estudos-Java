package com.brunodev.estudos.JmodificadorFinal.test;

import com.brunodev.estudos.JmodificadorFinal.dominio.Carro;
import com.brunodev.estudos.JmodificadorFinal.dominio.Comprador;
import com.brunodev.estudos.JmodificadorFinal.dominio.Ferrari;

public class CarroTest {
    static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Marcao");
        System.out.println(carro.COMPRADOR);

        //Variáveis do tipo que são uma referência, quando são finais não se pode alterar a referência para o objeto.
//      Comprador compradorTest = new Comprador();
//      carro.COMPRADOR = compradorTest;

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("California");
        ferrari.imprime();
    }
}
