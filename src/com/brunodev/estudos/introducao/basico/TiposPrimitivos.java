package com.brunodev.estudos.introducao.basico;

public class TiposPrimitivos {
    public static void main(String[] args) { //psvm tecla de atalho.
        //int, double, float, char, byte, short, long e boolean.

        //todos os tipos primitivos com excessão do boolean são numericos. E a diferença entre eles é o valor que se pode colocar dentro deles.
        //casting, quando você converte um tipo menor para um tipo maior, o Java faz automaticamente. Se tentar ir de um maior para menor, é nescessario fazer o casting.
        int idade = 13;
        long numeroGrande = 1000000;
        double salarioDouble = 1400;
        Float salarioFloat = 10.5f;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true; //true ou false (ela não pode ter esse nome, ela só retorna isso).
        boolean falso = false;
        char caractere = 'A'; //só se pode usar UM caracter, ou numero, de acordo com a tabela ASCII

        System.out.println(idade); //para imprimir o conteudo da variavel, se usa o nome da variavel sem as "". Com as "" vai ser no sentido literal, irá imprimir uma string.
        System.out.println("A idade é: " + idade + " anos"); //imprimindo uma string com o valor da variavel com +.
        

        //strings não são tipos primitivos (Ela é uma classe). 
        String nome = "Brunin lindão"; //string é "".
        System.out.println(nome); //sout tecla de atalho.


        System.out.println(idade);
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        
    }
}