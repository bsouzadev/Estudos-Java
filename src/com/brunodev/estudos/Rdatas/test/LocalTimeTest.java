package com.brunodev.estudos.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest {
    static void main(String[] args) {
        //LocalTime trabalha com horas.
        LocalTime time = LocalTime.of(23, 59, 59); //Cria uma hora especifica. Tomar couidado, pois a hora não passa de 23:59:59.
        System.out.println(time);

        LocalTime horaDeAgora = LocalTime.now(); //Pega a hora atual.
        System.out.println(horaDeAgora);

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
