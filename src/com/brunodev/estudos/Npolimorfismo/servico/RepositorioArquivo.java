package com.brunodev.estudos.Npolimorfismo.servico;

import com.brunodev.estudos.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em arquivos");
    }
}
