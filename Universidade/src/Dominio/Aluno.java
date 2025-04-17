package Dominio;

public class Aluno {
    private int matricula;
    private String nome;
    private Curso c1;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void imprimir(){
        System.out.println("Nome Aluno: " + nome);
        System.out.println("Matricula: " + matricula);
    }

    public void setCurso(Curso c1) {
        this.c1 = c1;
    }
}
