package com.brunodev.estudos.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest {
    static void main(String[] args) {
        Locale localeItaly = new Locale("it","IT"); //Configura o padrão para o italiano da Italia.
        Locale localeCH = new Locale("it","CH"); //Configura o padrão para o italiano da suíça.
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");

        Calendar c = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Italia: " + df1.format(c.getTime()));
        System.out.println("Suiça: " + df2.format(c.getTime()));
        System.out.println("India: " + df3.format(c.getTime()));
        System.out.println("Japao: " + df4.format(c.getTime()));
        System.out.println("Holanda: " + df5.format(c.getTime()));
    }
}


//Local serve para representar uma região geográfica, política ou cultural específica, permitindo adaptar a formatação de dados como números, moedas e datas. Ela define o idioma e o país usado pelo sistema.