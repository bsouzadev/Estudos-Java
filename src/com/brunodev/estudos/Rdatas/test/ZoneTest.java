package com.brunodev.estudos.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest {
    static void main(String[] args) {
        //Servem para lidar com o tempo em diferentes regiões do mundo: ZoneId, ZonedDateTime e OffsetDateTime. Elas ajudam a controlar fusos horários e diferenças de horas de forma correta. Esses -algum número é com base no zuloTime.
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds); //Zonas que o java oferece suporte.
        System.out.println(ZoneId.systemDefault()); //Retorna a zona que o meu So se encontra.

        //Pegando uma zona especifica:
        ZoneId zoneIdTokyo = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneIdTokyo);

        //Podemos usar o LocalDateTime para modificar a nossa data e horário da zona que escolhemos.
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(zoneIdTokyo);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(zoneIdTokyo);
        System.out.println(zonedDateTime1);

        //ZoneOffset deixa eu trabalhar com as zonas utilizando os horários.
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset zoneOffsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime1);

        //Faz o mesmo:
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, zoneOffsetManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(zoneOffsetManaus);
        System.out.println(offsetDateTime3);

        //Pegando uma data e vendo em qual era estava no Japão;
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate localDate = LocalDate.of(1900, Month.APRIL, 22);
        JapaneseDate japaneseDate1 = JapaneseDate.from(localDate);
        System.out.println(japaneseDate1);
    }
}