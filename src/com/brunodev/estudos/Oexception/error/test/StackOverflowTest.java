package com.brunodev.estudos.Oexception.error.test;

//Erro é algo que acontece na jvm e que "não" é possível recuperar em tempo de execução.
public class StackOverflowTest {
    public static void main(String[] args){
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
