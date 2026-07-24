package com.brunodev.estudos.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {
    static void main(String[] args) {
        //LocalDateTime é a junção da data e hora:
        LocalDateTime localDateTime = LocalDateTime.now(); //Cria a hora e a data de agora, conforme o SO.
        System.out.println(localDateTime);

        LocalDate data = LocalDate.parse("2024-02-02"); //Pegando uma data direto de uma string.
        LocalTime hora = LocalTime.parse("12:54:20"); //Pegando uma hora direto de uma string.
        System.out.println(data);
        System.out.println(hora);

        //Juntando a data da LocalDate com a hora da Localtime:
        LocalDateTime localDateTime1 = data.atTime(hora);
        System.out.println(localDateTime1);

        //Fazendo o mesmo com a hora:
        LocalDateTime localDateTime2 = hora.atDate(data);
        System.out.println(localDateTime2);
    }
}
