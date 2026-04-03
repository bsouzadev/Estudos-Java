package com.brunodev.estudos.exercicios.faculdade.lista1.test;

import java.util.Scanner;
import com.brunodev.estudos.exercicios.faculdade.lista1.dominio.NumeroComplexo;

public class NumeroComplexoMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite dois numeros complexos: ");
        NumeroComplexo n1 = new NumeroComplexo(s.nextDouble(), s.nextDouble());
        System.out.println("Digite mais dois numeros complexos: ");
        NumeroComplexo n2 = new NumeroComplexo(s.nextDouble(), s.nextDouble());
        s.close();

        NumeroComplexo Rs = n1.soma(n2);
        NumeroComplexo Rp = n1.produto(n2);
        NumeroComplexo Rc = n1.conjugado();
        System.out.println("Soma dos numeros complexos: " + Rs);
        System.out.println("Produto dos numeros complexos: " + Rp);
        System.out.println("Conjugado: " + Rc);


        //ToString:
        System.out.println(n1);
        System.out.println(n2);

    }
}
