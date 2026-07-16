package com.brunodev.estudos.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    static void main() {
        try{
            divisao(1,0);
        } catch (ArithmeticException e){
            System.out.println("Não é possível dividir por zero.");
        }
    }

    private static int divisao(int a, int b) throws ArithmeticException{
        //tratamento externo: (Lembrando que pode fazer essa exceção ser passada para cima através do comando throws no cabeçalho do metodo, fazendo assim ela ser tratada na main com o uso de try catch).
        if(b == 0) throw new ArithmeticException("Não é possível dividir por zero."); //Throw lança uma exceção. Mas nesse caso nem é nescessario fazer isso. Se b = 0, o própio progama já lança a exceção, e ela é passada para cima. Deixando somente nesse metodo return a/b.
        return a/b;

//      tratamento local:
//        try {
//            return a/b;
//        } catch (ArithmeticException e){
//            System.out.println("Não é possível dividir por zero");
//        }
//      return 0;
    }
}
