package com.brunodev.estudos.Kenumeracao.dominio;

public enum TipoCliente { //Enum é um tipo especial de classe, onde todos os atributos são constantes. Usado para representar um conjunto fixo de constantes. E quando se quer forçar o tipo certo.
    //As suas constantes (variáveis) são public static final por padrão.
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);
    //os tipos desses atributos são do tipoCliente.

    private final int VAlOR; //não pode ficar acima das constantes.

    TipoCliente(int valor) {
        this.VAlOR = valor;
    }

    public int getValor() {
        return VAlOR;
    }


    //É assim que acontece por debaixo dos panos quando se coloca os números na frente de pessoa fisica e jurídica.
//    public static final TipoCliente PESSOA_FISICA = new TipoCliente(1); //1 é passado para o construtor.
//    public static final TipoCliente PESSOA_JURIDICA = new TipoCliente(2);
}
