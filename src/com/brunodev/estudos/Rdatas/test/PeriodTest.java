package com.brunodev.estudos.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class PeriodTest {
    static void main(String[] args) {
        //Serve para medir quantidades de tempo baseadas em datas — especificamente em anos, meses e dias. Ela permite calcular o intervalo entre duas datas (LocalDate) ou somar e subtrair esses períodos.
        LocalDate dataHoje = LocalDate.now();
        LocalDate data2AnosDepois = LocalDate.now().plusYears(2).plusDays(7);

        Period period1 = Period.between(dataHoje, data2AnosDepois);
        System.out.println(period1);

        Period p2 = Period.ofDays(2);
        Period p3 = Period.ofMonths(5);
        Period p4 = Period.ofWeeks(48);
        Period p5 = Period.ofYears(2);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        //Se quisermos saber a quantidade de meses que da 48 semanas teremos que fazer:
        System.out.println(dataHoje.until(dataHoje.plusDays(p4.getDays()), ChronoUnit.MONTHS));
    }
}
