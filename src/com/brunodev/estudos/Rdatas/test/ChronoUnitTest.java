package com.brunodev.estudos.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest {
    static void main(String[] args) {
        //serve para representar unidades de tempo (como dias, horas, meses ou segundos) e calcular a diferença exata entre duas datas ou horários:
        LocalDateTime anniversary = LocalDateTime.of(2007, Month.FEBRUARY, 2, 12,0,0);

        System.out.println(ChronoUnit.DAYS.between(anniversary, LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(anniversary, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(anniversary, LocalDateTime.now()));
    }
}
