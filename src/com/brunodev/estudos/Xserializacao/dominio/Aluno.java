package com.brunodev.estudos.Xserializacao.dominio;

import java.io.*;

public class Aluno implements Serializable { //Para que uma classe aceite ser serializada, a sua definição precisa implementar a marcação implements Serializable.
    @Serial
    private static final long serialVersionUID = -78279237720096242L; //SerialVersionUID garante que o programa que está salvando o arquivo e o programa que está lendo o arquivo estão usando exatamente a mesma versão da classe Aluno.

    private Long id;
    private String nome;
    private transient String password; //transient = o atributo não deve ser serializado (salvado).
    private transient Turma turma;

    //Atributos estáticos não são serializados, pois pertencem à classe.
    private static final String NOME_ESCOLA = "Afonsoo";

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", nome Escola='" + NOME_ESCOLA + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }

    //Serializando um objeto que não implementa a interface Serializable.
    @Serial
    private void writeObject (ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Serial
    private void readObject (ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}