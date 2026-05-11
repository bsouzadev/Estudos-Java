package com.brunodev.estudos.Npolimorfismo.servico;

import com.brunodev.estudos.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
