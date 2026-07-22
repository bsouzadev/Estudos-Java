package com.brunodev.estudos.Rdatas.test;

import java.text.DateFormat;
import java.util.Calendar;

//Formatação de datas
public class DateFormatTest {
    static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7]; //Cria apenas um vetor de referências. Nenhum objeto DateFormat foi criado.
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        df[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for(DateFormat dateFormat : df){
            System.out.println(dateFormat.format(c.getTime()));
        }
    }
}

//Importante:
//Imagina que a gente cria um array de frutas:
//        String[] frutas;
//        Nesse momento, a gente só declarou o array — ainda não colocamos nenhuma fruta dentro.
//
//        A responsabilidade de dizer quais frutas vão estar lá é depois, quando a gente preencher o array.
//
//        Ou seja, não é que a gente esteja criando frutas ainda, a gente só criou o espaço pra depois colocar elas.
//
//        Mesma ideia com DateFormat[]:
//        Você cria o array primeiro, sem instanciar objetos específicos. Depois, você coloca dentro objetos que batem com o tipo (DateFormat ou filho dele).