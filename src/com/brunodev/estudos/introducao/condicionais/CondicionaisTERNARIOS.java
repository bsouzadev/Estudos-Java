package com.brunodev.estudos.introducao.condicionais;

public class CondicionaisTERNARIOS {
    public static void main(String[] args){
        //doar se salario for > 5k
        double salario = 5000;
        String mensagemDoar = "Eu vou doar 500 reais";
        String mensagemNaoDoar = "Não tenho dinheiro, mas futuramente irei ter!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.err.println(resultado);

        //pode ser feito dessa maneira, com variaveis, ou diretamente colocar a escrita no println.

        /*
        if(salario > 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }

        System.out.println(resultado);
        */

        /*
        nesse caso podemos usar o operador ternario:
        sintaxe: condição ? verdadeiro : falso; (O resultado do operador ternário é atribuído a uma variável, e é importante que o tipo desse resultado seja compatível com o tipo da variável que irá armazená-lo.).
        */
    }
}
