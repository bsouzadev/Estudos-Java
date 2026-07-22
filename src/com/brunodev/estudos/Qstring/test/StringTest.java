package com.brunodev.estudos.Qstring.test;

public class StringTest {
    public static void main(String[] args){
        // Strings em Java são imutáveis (nunca mudam de valor diretamente na memória).

        // Cria o objeto "Bruno" no String Constant Pool e faz a variável apontar para ele.
        String nomeDoBonitao = "Bruno";

        // O Java reaproveita o "Bruno" já existente no Pool.
        // Ambas as variáveis de referência agora apontam para o mesmíssimo objeto na memória.
        String nomeDoBonitao2 = "Bruno";

        // Devido à imutabilidade, o metodo .concat() NÃO altera o "Bruno" original.
        // O Java cria um novo objeto ("Bruno Souza") em outro lugar da memória.
        // A reatribuição (=) faz a variável 'nomeDoBonitao' mudar de ponteiro e apontar para esse novo objeto.
        nomeDoBonitao = nomeDoBonitao.concat(" Souza");

        System.out.println(nomeDoBonitao);

        // Retorna 'false' porque 'nomeDoBonitao' agora aponta para o novo endereço ("Bruno Souza"),
        // enquanto 'nomeDoBonitao2' continua apontando com segurança para o "Bruno" original.
        System.out.println(nomeDoBonitao == nomeDoBonitao2);

        // O 'new' força o Java a ignorar o Pool e criar um objeto "Bruno" totalmente novo na memória Heap.
        String nomeDoBonitao3 = new String("Bruno");

        // Dá 'false' porque, apesar de terem o mesmo texto, elas apontam para endereços de memória diferentes.
        System.out.println(nomeDoBonitao2 == nomeDoBonitao3);

        // intern() retorna a referência da String presente no String Pool.
        // Se ela já existir no Pool, retorna a referência existente.
        // Caso contrário, adiciona a String ao Pool e retorna essa referência.
        System.out.println(nomeDoBonitao2 == nomeDoBonitao3.intern());

        // Resumo definitivo: Strings são imutáveis na memória. Para "mudar" o valor visual de uma variável,
        // o Java cria um objeto novo e você precisa reatribuí-lo à variável de referência.
    }
}