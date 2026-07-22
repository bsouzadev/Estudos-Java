package com.brunodev.estudos.Qstring.test;

public class StringTest02 {
    static void main(String[] args) {
        String nome = "        Bruno           ";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); //Retorna o character com base no índice.
        System.out.println(nome.length()); //Retorna o tamanho da string.
        System.out.println(nome.replace("o", "a")); //Troca o carácter especifico pelo desejado.
        System.out.println(nome.toLowerCase()); //Troca o carácter especifico pelo desejado.
        System.out.println(nome.toUpperCase()); //Troca o carácter especifico pelo desejado.
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,3)); //Extrair uma parte da string. Porém, o último índice é sempre -1 do que foi passado. Então, na verdade estou pegando um padeço de 0 a 2.
        System.out.println(nome.trim()); //Remove os espaços no começo e final da string.
    }
}