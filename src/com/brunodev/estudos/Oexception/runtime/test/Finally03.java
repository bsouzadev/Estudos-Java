package com.brunodev.estudos.Oexception.runtime.test;

public class Finally03 {
    static void main(String[] args) {
        try{
            abreConexao2();
        } catch (RuntimeException e) {
            System.out.println("tratando a exceção que foi lançada em abreConexao2");
        }
    }

    public static String abreConexao(){
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo dados no Arquivo");
            return "Conexão aberta";

        } catch (Exception e) {
            e.printStackTrace();

        } finally { //bloco finally é um bloco que sempre é executado independente de uma exceção/return acontecer ou não dentro do try.
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    public static void abreConexao2(){
        try {
            System.out.println("Abrindo Arquivo");
            System.out.println("Escrevendo dados no Arquivo");
            throw new RuntimeException();

        } finally { //Não se pode criar um try sozinho, tem que ser com catch ou finally.
            System.out.println("Fechando recurso liberado pelo SO");
        }

    }
}

//Finally é usado principalmente para operações essenciais de limpeza, como fechar arquivos, encerrar conexões de banco de dados ou liberar recursos de rede.