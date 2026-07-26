package com.brunodev.estudos.Sformatacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest {
    static void main(String[] args) {
        //Serve para formatar e analisar (fazer parse) objetos de data e hora em Java (como LocalDate, LocalTime e LocalDateTime), transformando textos em datas ou datas em textos legíveis.
        //Format = Transformando o objeto numa string.
        //Parse = Transformando uma string para o meu objeto.

        LocalDate localDate = LocalDate.now();
        String string1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        String string2 = localDate.format(DateTimeFormatter.ISO_DATE);
        String string3 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);

        LocalDate parse1 = LocalDate.parse("20260726", DateTimeFormatter.BASIC_ISO_DATE); //A string tem que bater com o padrão do DateTimeFormatter.
        LocalDate parse2 = LocalDate.parse("2026-07-26", DateTimeFormatter.ISO_DATE); //A string tem que bater com o padrão do DateTimeFormatter.
        LocalDate parse3 = LocalDate.parse("2026-07-26", DateTimeFormatter.ISO_LOCAL_DATE); //A string tem que bater com o padrão do DateTimeFormatter.
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        //Fazendo com LocalDateTime:
        LocalDateTime localDateTime = LocalDateTime.now();
        String string4 = localDateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(string4);

        LocalDateTime parse = LocalDateTime.parse("2026-07-26T15:44:59.0686748", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse);

        //Criando formatos personalizados:
        DateTimeFormatter formatterBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String stringformatterBrasil = LocalDate.now().format(formatterBrasil);
        System.out.println(stringformatterBrasil);

        LocalDate localDateBr = LocalDate.parse("26/07/2026", formatterBrasil);
        System.out.println(localDateBr);


        DateTimeFormatter formatterGERMANY = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMANY);
        String stringformatterGERMANY = LocalDate.now().format(formatterGERMANY);
        System.out.println(stringformatterGERMANY);
        LocalDate parseGR = LocalDate.parse("26.Juli.2026", formatterGERMANY);
        System.out.println(parseGR);

    }
}
