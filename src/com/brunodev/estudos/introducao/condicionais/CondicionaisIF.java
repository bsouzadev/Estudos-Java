package com.brunodev.estudos.introducao.condicionais;

public class CondicionaisIF {
    public static void main(String[] args){
        int idade = 17;

        //só se compara valores booleanos.
        if(idade <= 17){
            System.out.println("É menor de idade!");
        } 


        int idade2 = 15;
        boolean isAutorizarEntrarNoIf = idade2 >= 20;

        if(isAutorizarEntrarNoIf){
            System.out.println("Autorizado!");
        } 
        
        if(isAutorizarEntrarNoIf == false){ //da para colocar o operador de negação tambem: !isAutorizarEntrarNoIf (lê-se: se não é autorizado a entrar no if).
            System.out.println("Não autorizado a entrar no if.");
        }
    }
}
