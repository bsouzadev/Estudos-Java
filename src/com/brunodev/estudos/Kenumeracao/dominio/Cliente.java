package com.brunodev.estudos.Kenumeracao.dominio;

public class Cliente {

    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    //
    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    //
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + this.nome + '\'' +
                ", tipoCliente=" + this.tipoCliente +
                ", tipoClienteInt=" + this.tipoCliente.getValor() +
                ", tipoPagamento=" + this.tipoPagamento +
                '}';
    }
}
