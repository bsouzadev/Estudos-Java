package com.brunodev.estudos.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjusterExercicioCorrecaoTest {
    //Considerando sex, sab, dom é dia de semana. Dado uma determinada data temos que retornar o proximo dia util.
    public static void main(String[] args){
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new obterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().withDayOfMonth(15).with(new obterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}

class obterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int diaProx;

        if(dayOfWeek == DayOfWeek.THURSDAY){
            diaProx = 4;
        } else if (dayOfWeek == DayOfWeek.FRIDAY){
            diaProx = 3;
        } else if (dayOfWeek == DayOfWeek.SATURDAY){
            diaProx = 2;
        } else {
            diaProx = 1;
        }
        return temporal.plus(diaProx, ChronoUnit.DAYS);
    }
}