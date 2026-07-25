package com.brunodev.estudos.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {
    static void main(String[] args) {
        //Serve para realizar cálculos e modificações complexas em objetos de data e hora (como LocalDate) de forma limpa e legível. Ele fornece métodos prontos para encontrar o primeiro ou último dia do mês, o próximo dia da semana ou o último dia do ano.

        LocalDate now = LocalDate.now();
        //now = now.withDayOfMonth(31); Mudando somente o dia do mes atual.
        now = now.with(ChronoField.DAY_OF_MONTH, 24); //Faz o mesmo que a linha acima.
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)); //Retornando para mim o proximo domingo.
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY)); //Retornando para mim a próxima quinta.
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.SUNDAY)); //Retornando para mim o último domingo.
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()); //Retornando para mim o primeiro dia do mes.
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()); //Retornando para mim o último dia do mes.
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear()); //Retornando para mim o primeiro dia do proximo ano.
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
