package com.brunodev.estudos.Pwrapper.test;

public class WrapperTest {
    public static void main(String[] args){
        //O java possui 8 tipos primitivos:
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

        //Transformando os tipos primitivos em Wrappers:
        //Esses novos valores são relacionados ao polimorfismo, e não ao tamanho que se pode colocar em memória. E agora eles são objetos!
        //Autoboxing:
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

        //O Autoboxing é a conversão automática de um primitivo para sua classe wrapper (ex: int para Integer).
        //O Unboxing é o processo inverso, onde o wrapper é convertido de volta para o primitivo (ex: Integer para int)

        int i = intW; //Unboxing.
        Integer intW2 = Integer.parseInt("2"); //Converte a String para inteiro. Tem como fazer isso para os outros tipos primitivos também.
        //Float testaNumero = Float.parseFloat("33");
        Boolean verdade = Boolean.parseBoolean("tRUE");


        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));

    }
}
