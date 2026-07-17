package com.brunodev.estudos.Oexception.runtime.test;

public class RunTimeExceptionTest02 {

    static void main() {
        divisao(1,0);
        System.out.println("Não é possível dividir por zero.");
    }

    private static int divisao(int a, int b) throws ArithmeticException{
        //Essa exceção pode ser passada para cima através do comando throws, assim ela vai ser tratada na main com o uso de try catch.

        if(b == 0) throw new ArithmeticException("Não é possível dividir por zero.");//Throw lança uma exceção.

        return a/b;
    }
}


//Checked Exception → throws é obrigatório se você não tratar a exceção no próprio metodo.
//Unchecked Exception → throws é opcional. Serve apenas para indicar que o metodo pode lançar aquela exceção. Mesmo sem throws, a exceção é propagada (jogada para cima) automaticamente desde que ela não seja tratada no próprio metodo.