package com.brunodev.estudos.Npolimorfismo.test;

import com.brunodev.estudos.Npolimorfismo.repositorio.Repositorio;
import com.brunodev.estudos.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    static void main() {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
