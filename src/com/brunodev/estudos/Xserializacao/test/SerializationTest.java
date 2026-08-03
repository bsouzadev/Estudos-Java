package com.brunodev.estudos.Xserializacao.test;

import com.brunodev.estudos.Xserializacao.dominio.Aluno;
import com.brunodev.estudos.Xserializacao.dominio.Turma;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest {
    //A serialização em Java serve para transformar um objeto numa sequência de bytes, permitindo salvar o seu estado em arquivos, enviá-lo pela rede ou passá-lo entre diferentes sistemas. O processo inverso, que reconstrói os bytes de volta num objeto ativo na memória, chama-se desserialização.

    static void main(String[] args) {
        //Digamos que queremos salvar o estado desse objeto num arquivo e depois ler:
        Aluno aluno = new Aluno(1L, "Bruno Augusto", "1234");
        Turma turma = new Turma("terceirao");
        aluno.setTurma(turma);

        serializar(aluno);
        deserializar();

    }


    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta/Aluno.ser");//Aonde queremos salvar.

        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) { //Salvar o objeto no disco.
            //Files.newOutputStream(path) cria o fluxo de saída para o arquivo, e ObjectOutputStream o transforma num fluxo capaz de converter objetos Java em bytes.

            oos.writeObject(aluno); //Pega o objeto aluno, converte todos os seus dados numa sequência de bytes e os grava fisicamente no arquivo.

        } catch (IOException e){
            e.printStackTrace();
        }
    }


    private static void deserializar(){ //Le o objeto do disco e traz ele de volta para a memória.
        Path path = Paths.get("pasta/Aluno.ser");//Caminho do arq aonde iremos lê-lo.

        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            //Files.newInputStream(path) abre o arquivo para leitura de bytes, e ObjectInputStream serve para decodificar esses bytes de volta em estruturas de objetos Java.

            Aluno aluno = (Aluno) ois.readObject(); //ois.readObject() lê os bytes e recria um objeto Aluno através do cast.
            System.out.println(aluno); //Exibe os dados do aluno no console. Para funcionar de forma legível, a classe Aluno precisa ter o metodo toString() implementado.

        } catch (IOException | ClassNotFoundException e ){
            e.printStackTrace();
        }
    }
}

//Um dos usos interessantes sobre serialização:
//Persistência de dados: Gravar o estado atual de um objeto em arquivos binários para reutilizá-lo depois que o programa for fechado e aberto novamente.

//Importante:

//Na Serialização: O Java congela o estado atual do objeto (todas as suas variáveis com os valores daquele exato momento) e joga para o arquivo.
//Na Desserialização: O Java apenas descongela essa foto. O objeto volta para a memória com as informações idênticas e do mesmo jeito que estavam quando você o salvou.
//É por isso que ele pula o construtor: o construtor serve para criar um objeto novo (do zero), e o que você está fazendo na desserialização é apenas reviver um objeto velho que já existia.