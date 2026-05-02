package com.brunodev.estudos.Kenumeracao.test;

import com.brunodev.estudos.Kenumeracao.dominio.Cliente;
import com.brunodev.estudos.Kenumeracao.dominio.TipoCliente;
import com.brunodev.estudos.Kenumeracao.dominio.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Geraldo", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente1 = new Cliente("Averaldo", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente);
        System.out.println(cliente1);
        System.out.println(TipoPagamento.DEBITO.calculaDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calculaDesconto(100));
    }
}
