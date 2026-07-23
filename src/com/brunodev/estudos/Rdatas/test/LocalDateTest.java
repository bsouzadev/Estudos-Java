package com.brunodev.estudos.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
    static void main(String[] args) {
        //LocalDate só trabalha com a data e é uma classe imutável:
        LocalDate date = LocalDate.of(2007, Month.FEBRUARY,2); //Cria uma data específica.
        LocalDate dataHoje = LocalDate.now(); //Data de hoje.

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek()); //Dia da semana da data especificada.
        System.out.println(date.getDayOfYear());
        System.out.println(date.isLeapYear()); //Retorna se o ano da data especificada é bissexto ou não.
        System.out.println(date);
        System.out.println(dataHoje);
        System.out.println(LocalDate.MAX); //Data max que se pode utilizar.
        System.out.println(LocalDate.MIN); //Data min que se pode utilizar.
    }
}
