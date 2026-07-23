package com.brunodev.estudos.Sformatacao;

import java.util.Locale;

public class LocalTest02 {
    static void main(String[] args) {
        System.out.println(Locale.getDefault()); //Retorna como o sistema op está configurado no meu pc.

        //Todas as iso que são suportadas tanto de línguas quanto de países;
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
        System.out.println();
        for (String isoCountry : isoCountries) {
            System.out.print(isoCountry + " ");
        }

    }
}
