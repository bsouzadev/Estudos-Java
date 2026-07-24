package com.brunodev.estudos.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest {
    static void main(String[] args) {
        //Serve para medir uma quantidade de tempo baseada em horas, minutos, segundos e nanossegundos. Ela é ideal para calcular a diferença exata entre dois horários ou somar e subtrair blocos de tempo.
        //O Java exige que as classes tenham o componente de tempo (horas, minutos, segundos e nanossegundos). Para medir datas usamos Period.

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime dataDoisAnosDepois = LocalDateTime.now().plusYears(2).plusMinutes(8);

        LocalTime localTime = LocalTime.now();
        LocalTime hora7maisTarde = LocalTime.now().plusHours(7);

        Duration duration1 = Duration.between(localDateTime, dataDoisAnosDepois);
        System.out.println(duration1);

        Duration duration2 = Duration.between(localTime, hora7maisTarde);
        System.out.println(duration2);

        Duration duration3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        System.out.println(duration3);
    }
}
