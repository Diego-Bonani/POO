import Dominio.Aluno;
import Dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Engenharia da Computação", 10);
        Aluno a1 = new Aluno(1, "Ricardo");
        Aluno a2 = new Aluno(2, "Joana");
        Aluno a3 = new Aluno(3, "Julio");

        curso1.matricular(a1);
        curso1.matricular(a1);
        curso1.matricular(a2);
        curso1.matricular(a3);
        curso1.imprimir();
    }
}
