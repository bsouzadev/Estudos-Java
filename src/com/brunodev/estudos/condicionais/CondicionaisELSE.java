package com.brunodev.estudos.condicionais;

public class CondicionaisELSE {
    public static void main(String[] args) {
        //variaveis dentro de metodos precisam ser inicializadas, antes de ser executadas!

        int idade = 15;
        boolean isVerificaAIdade = idade > 18;

        if(isVerificaAIdade){ //! inverte o valor booleano.
            System.out.println("Maior de idade! Acesso liberado!");
        }else{
            System.out.println("Acesso negado! Di menor");
        }

        //

        int idade2 = 17;
        
        if(idade2 < 15){
            System.out.println("Categoria infantil.");
        }else if(idade2 >= 15 && idade2 < 18){
            System.out.println("Categoria juvenil");
        }else{
            System.out.println("Categoria adulto");
        }
    }
}
