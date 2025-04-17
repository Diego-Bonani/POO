import pack.Membro;
import pack.Projeto;

public class Main {
    public static void main(String[] args) {
        Projeto p1 = new Projeto("Interface Gráfica");
        Membro m1 = new Membro("Joao", "16/04/1965", 2500);
        Membro m2 = new Membro("Marcos", "22/07/2000", 1222);
        Membro m3 = new Membro("Maria", "09/11/1968", 3000);

        p1.adicionarMembro(m1);
        p1.adicionarMembro(m2);
        p1.adicionarMembro(m3);
        p1.imprimir();

        p1.removerMembro("Joao", "16/04/1965");
        p1.imprimir();
    }
}