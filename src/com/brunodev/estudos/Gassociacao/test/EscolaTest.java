package com.brunodev.estudos.Gassociacao.test;

import com.brunodev.estudos.Gassociacao.dominio.Escola;
import com.brunodev.estudos.Gassociacao.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {

        Professor prof = new Professor("Professor girafales");
        Professor prof2 = new Professor("Mestre shifu");
        Professor[] profes = new Professor[2];
        profes[0] = prof;
        profes[1] = prof2;
        Escola escola = new Escola("Turma do Fundão", profes);

        escola.imprime();

        //Somente para visualizar os endereços de memoria
        System.out.println("End objeto prof " + prof);
        System.out.println("End array " + profes);
        System.out.println("End do array na posição 1 " + profes[0]);
        System.out.println("Acessando conteudo via ponteiro " + profes[0].getNome());
    }
}
