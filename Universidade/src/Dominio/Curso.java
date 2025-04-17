package Dominio;

public class Curso {
    private String nome;
    private Aluno[] alunos;
    private int qtdAlunosInscritos;

    public Curso(String nome, int nrVagas) {
        this.nome = nome;
        this.alunos = new Aluno[nrVagas];
    }

    public boolean matricular(Aluno a){
        for (int i = 0; i < qtdAlunosInscritos; i++){
            if(this.alunos[i].getMatricula() == a.getMatricula()) {
                return false;
            }
        }
        this.alunos[qtdAlunosInscritos] = a;
        a.setCurso(this);
        qtdAlunosInscritos++;
        return true;
    }

    public boolean cancelarMatricula(int matricula){
        for (int i = 0; i < qtdAlunosInscritos; i++) {
            if(this.alunos[i].getMatricula() == matricula){
                this.alunos[i].setCurso(null);
                this.alunos[i] = this.alunos[qtdAlunosInscritos - 1];
                qtdAlunosInscritos--;
                return true;
            }
        }
        return false;
    }

    public void imprimir(){
        System.out.println("Curso: " + this.nome);
        for (int i = 0; i < qtdAlunosInscritos; i++){
            alunos[i].imprimir();
        }
    }
}
