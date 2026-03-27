package com.brunodev.estudos.BintroducaoMetodos.dominio;

//metodos...
public class Calculadora {
    
    //Para um método, é necessário um modificador de acesso, um tipo de retorno (ou indicar que não retorna nada) e um nome.
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
        //saida é diferente de retorno
    }

    public void subDoisNumeros(){
        System.out.println(20 - 2);
        //saida é diferente de retorno
    }

    //metodos com parametros:
    public void multDoisNum(int num1, int num2){
        System.out.println(num1 * num2);
        //saida é diferente de retorno
    }
    
    //retornos:
    public double divideDoisNum(double num1, double num2){
        if(num2 == 0) return 0;
        return num1/num2;
    }

    public void imprimeDiv(int n1, int n2){
        if(n2 == 0){
            System.out.println("Não pode dividir por zero.");
            return; //criterio de parada.
        }

        System.out.println(n1/n2);
    }

    // Passagem por valor tipo primitivo: o número original não é alterado, pois é criada uma cópia dele.
    public void alteraDoisNum(int n1, int n2){
        n1 = 99;
        n2 = 33;
        System.out.println("Dentro do metodo: ");
        System.out.println("Num1: " + n1);
        System.out.println("Num2: " + n2);
    }
}
