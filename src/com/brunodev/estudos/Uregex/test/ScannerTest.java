package com.brunodev.estudos.Uregex.test;

public class ScannerTest {
    static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa, true, 200";
        String[] nomes = texto.split(","); //O metodo split() serve para cortar uma ‘String’ em várias partes e guardar o resultado dentro de um Array.

        for(String nome : nomes){
            System.out.println(nome.trim());
        }
    }
}


// Conceito Técnico: Tokens e Delimitadores✂
// Delimitador: É o caractere que você usa como "tesoura" (o separador). Ele define onde a string será cortada e desaparece após o corte.
// Tokens: São os pedaços de texto que sobram após o corte. Cada posição do seu array final é um token.
// Exemplo Visual: Se temos o texto "café;água;suco" e usamos o ; no split():
// Delimitador: ;
// Tokens gerados: "café", "água", "suco"