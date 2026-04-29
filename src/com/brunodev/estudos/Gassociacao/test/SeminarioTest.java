package com.brunodev.estudos.Gassociacao.test;

import com.brunodev.estudos.Gassociacao.dominio.AlunoSeminario;
import com.brunodev.estudos.Gassociacao.dominio.LocalSeminario;
import com.brunodev.estudos.Gassociacao.dominio.ProfessorSeminario;
import com.brunodev.estudos.Gassociacao.dominio.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        LocalSeminario localSeminario = new LocalSeminario("Fenda do biquíni");

        AlunoSeminario alunoSeminario = new AlunoSeminario("Lula molusco" , 19);
        AlunoSeminario alunoSeminario1 = new AlunoSeminario("Bob detergente", 33);
        AlunoSeminario alunoSeminario2 = new AlunoSeminario("Plankton", 23);
        AlunoSeminario alunoSeminario3 = new AlunoSeminario("Patrick", 31);

        AlunoSeminario[] alunosSeminarioA = {alunoSeminario1, alunoSeminario};
        AlunoSeminario[] alunosSeminarioB = {alunoSeminario2, alunoSeminario3};

        Seminario seminarioA = new Seminario("A fórmula do Hambúrguer de Siri" , alunosSeminarioA, localSeminario);
        Seminario seminarioB = new Seminario("Como roubar a fórmula do Hambúrguer de Siri", alunosSeminarioB, localSeminario);

        Seminario[] seminariosProfessor = {seminarioA,seminarioB};
        ProfessorSeminario professorSeminario = new ProfessorSeminario("Bolha Suja", "Se fingir de amigo", seminariosProfessor);

        //
        System.out.println("----Alunos----");
        for(AlunoSeminario alunos : alunosSeminarioA){
            alunos.imprime();
        }

        System.out.println();

        for(AlunoSeminario alunos : alunosSeminarioB){
            alunos.imprime();
        }

        System.out.println();

        System.out.println("----Professor----");
        professorSeminario.imprime();

        System.out.println();

        System.out.println("----Informações dos Seminários----");
        seminarioA.imprime();
        System.out.println();
        seminarioB.imprime();

    }
}
