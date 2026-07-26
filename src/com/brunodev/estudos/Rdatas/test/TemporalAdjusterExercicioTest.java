package com.brunodev.estudos.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class TemporalAdjusterExercicioTest {
    //Considerando sex, sab, dom é dia de semana. Dado uma determinada data temos que retornar o proximo dia util.
    static void main(String[] args) {
        DiaUtil diaUtil = new DiaUtil();
        LocalDate now = LocalDate.now();
        LocalDate localDate = diaUtil.retornaProximoDiaUtil(now);
        System.out.println(localDate);

        //Passando uma segunda-feira:
        LocalDate localDate2 = LocalDate.of(2026, Month.JULY, 20);
        LocalDate localDate3 = diaUtil.retornaProximoDiaUtil(localDate2);
        System.out.println(localDate3);
    }
}

class DiaUtil {
    public LocalDate retornaProximoDiaUtil(LocalDate data){
        if (data.getDayOfWeek() == DayOfWeek.FRIDAY){
            return data.plusDays(3); //Pega a data, soma mais 3 dias e retorna o dia da semana certo.
        } else if(data.getDayOfWeek() == DayOfWeek.SATURDAY){
            return data.plusDays(2); //Pega a data, soma mais 2 dias e retorna o dia da semana certo.
        }

        return data.plusDays(1); //Pega a data, soma mais 1 dia e retorna o dia da semana certo.
    }
}