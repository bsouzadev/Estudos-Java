package com.brunodev.estudos.Gassociacao.dominio;

public class ProfessorSeminario {
    private String nome, especialidade;
    private Seminario[] seminarios;

    //
    public ProfessorSeminario(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public ProfessorSeminario(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    //
    public void imprime(){
        System.out.println("Nome do professor: " + getNome());
        System.out.println("Especialidade: " + getEspecialidade());
        if(seminarios == null) return;
        System.out.println("Seminários cadastrados: ");
        for (int i = 0; i < this.seminarios.length; i++) {
            System.out.println(seminarios[i].getTitulo());
        }
    }

    //
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
