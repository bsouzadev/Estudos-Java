package com.brunodev.estudos.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private AlunoSeminario[] alunosSeminario;
    private LocalSeminario localSeminario;

    //
    public Seminario(String titulo, AlunoSeminario[] alunosSeminario, LocalSeminario localSeminario){
        this.titulo = titulo;
        this.alunosSeminario = alunosSeminario;
        this.localSeminario = localSeminario;
    }

    //
    public void imprime(){
        System.out.println("Nome do seminário: " + this.titulo + "\nEndereço: " + this.localSeminario);
        if(alunosSeminario == null) return;

        System.out.println("Os alunos que estão inscritos no seminário de " + this.titulo + " são: ");
        for (int i = 0; i < this.alunosSeminario.length; i++) {
            System.out.println(this.alunosSeminario[i].getNome());
        }
    }

    //
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public AlunoSeminario[] getAlunosSeminario() {
        return alunosSeminario;
    }

    public void setAlunosSeminario(AlunoSeminario[] alunosSeminario) {
        this.alunosSeminario = alunosSeminario;
    }

    public LocalSeminario getLocalSeminario() {
        return localSeminario;
    }

    public void setLocalSeminario(LocalSeminario localSeminario) {
        this.localSeminario = localSeminario;
    }
}
