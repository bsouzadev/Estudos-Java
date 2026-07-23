package com.brunodev.estudos.Sformatacao;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nb = new NumberFormat[4];

        nb[0] = NumberFormat.getInstance();
        nb[1] = NumberFormat.getInstance(localePT);
        nb[2] = NumberFormat.getInstance(localeJP);
        nb[3] = NumberFormat.getInstance(localeIT);

        double valor = 10_000.2313;
        for (NumberFormat numberFormat : nb) {
            System.out.println(numberFormat.format(valor));
        }

    }
}
