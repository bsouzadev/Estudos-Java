package com.brunodev.estudos.Kenumeracao.dominio;

public enum TipoCliente { //Enum é um tipo especial de classe, onde todos os atributos são constantes. Usado para representar um conjunto fixo de constantes. E quando se quer forçar o tipo certo.
    //As suas constantes (variáveis) são public static final por padrão.
    PESSOA_FISICA(1, "Pessoa fisica"),
    PESSOA_JURIDICA(2, "Pessoa juridica");
    //os tipos desses atributos são do tipoCliente.

    private final int VAlOR; //não pode ficar acima das constantes.
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VAlOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    //metodo para buscar uma enum através de um atributo especifico.
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        //values retorna uma array de todas as enumerações.
        for (TipoCliente tipoCliente : values()){
            if(tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }

        return null;
    }

    //
    public int getValor() {
        return VAlOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    //É assim que acontece por debaixo dos panos quando se coloca os números na frente de pessoa fisica e jurídica.
//    public static final TipoCliente PESSOA_FISICA = new TipoCliente(1, "Pessoa fisica"); //1 e Pessoa fisica é passado para o construtor.
//    public static final TipoCliente PESSOA_JURIDICA = new TipoCliente(2, "Pessoa jurídica");
}
