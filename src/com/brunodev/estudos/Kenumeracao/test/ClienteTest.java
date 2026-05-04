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

        //Atrvés do metodo que retorna pelo nome:
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA"); //valueOf, retorna a enum através do nome (CONSTANTE). No caso irá me ratonar o enum PESSOA_FISICA.
        System.out.println(tipoCliente.getValor()); //tipoCliente tem PESSOA_FISICA.

        //Através do metodo criado que retorna pelo atributo:
        TipoCliente tipoCliente1 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa fisica");
        System.out.println(tipoCliente1); //tipoCliente1 tem PESSOA_FISICA. Porem, ela foi procurada através de algum atributo, e não diretamente pelo nome da variavel (CONSTANTE).
    }
}
