package com.brunodev.estudos.Sformatacao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatMoedaTest02 {
    static void main(String[] args) {
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nb = new NumberFormat[4];

        nb[0] = NumberFormat.getCurrencyInstance();
        nb[1] = NumberFormat.getCurrencyInstance(localePT);
        nb[2] = NumberFormat.getCurrencyInstance(localeJP);
        nb[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 10_000.2313;
        for (NumberFormat numberFormat : nb) {
            System.out.println(numberFormat.format(valor));
        }

        String valorSting = "￥10,000";
        try {
            System.out.println(nb[2].parse(valorSting)); //Transforma o valor da String numa moeda especifica.
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
