package com.brunodev.estudos.Oexception.exception.dominio;

import com.brunodev.estudos.Oexception.exception.dominio.Pessoa;

public class Funcionario extends Pessoa {
    public void salvar() throws LoginInvalidoException{
        System.out.println("Salvando Funcionário");
    }
}


// Ao sobrescrever um metodo, não é obrigatório declarar as mesmas exceções do metodo original.
// O metodo sobrescrito pode:
//
// - Não declarar nenhuma exceção.
// - Declarar apenas algumas das exceções do metodo original.
// - Declarar todas as exceções do metodo original.
// - Declarar subclasses (mais específicas) das exceções checked já declaradas.
// - Declarar qualquer exceção unchecked (RuntimeException e as suas subclasses).
//
// O metodo sobrescrito NÃO pode:
//
// - Declarar uma exceção checked que não foi declarada no metodo original.
// - Declarar uma exceção checked mais genérica do que a do metodo original.