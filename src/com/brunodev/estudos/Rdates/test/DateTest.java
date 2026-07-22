package com.brunodev.estudos.Rdates.test;

import java.util.Date;

public class DateTest {
    static void main(String[] args) {
        Date date = new Date(1784748669130L); //Conta o tempo a partir de milliseconds, através do long.
        date.setTime(date.getTime() + 3_600_000L); //Adiciona 1 hora.
        System.out.println(date);
    }
}
//Date quase não se usa mais no dia a dia. Parte dos metodos estão obsoletos.