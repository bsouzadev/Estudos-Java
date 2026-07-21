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
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;
    }
}
