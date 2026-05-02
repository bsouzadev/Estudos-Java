package com.brunodev.estudos.Kenumeracao.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calculaDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double calculaDesconto(double valor) {
            return valor * 0.05;
        }
    }, DINHEIRO {
        @Override
        public double calculaDesconto(double valor) {
            return valor * 0.1;
        }
    };

    public abstract double calculaDesconto(double valor);
}
