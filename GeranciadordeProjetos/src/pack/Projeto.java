package pack;

public class Projeto {
    private String nome;
    private int custo;
    private Membro[] membros;
    private int qtdMembros;

    public Projeto(String nome) {
        this.nome = nome;
        this.membros = new Membro[50];
    }

    public boolean adicionarMembro(Membro m){
        for (int i = 0; i < qtdMembros; i++) {
            if(checaMembros(m.getNome(), m.getDatanasc(), membros[i].getNome(), membros[i].getDatanasc())){
                return false;
            }
        }
        this.membros[qtdMembros] = m;
        this.custo += m.getSalario();
        qtdMembros++;
        return true;
    }

    public boolean removerMembro(String nome, String datanasc){
        for (int i = 0; i < qtdMembros; i++) {
            if(checaMembros(nome, datanasc, membros[i].getNome(), membros[i].getDatanasc())){
                membros[i] = membros[qtdMembros - 1];
                qtdMembros--;
                custo -= membros[i].getSalario();
                return true;
            }
        }
        return false;
    }

    public void imprimir(){
        System.out.println("Nome do Curso: " + this.nome);
        System.out.println("Custo: " + this.custo);
        for (int i = 0; i < qtdMembros; i++) {
            membros[i].imprimir();
        }
    }

    private boolean checaMembros(String nome1, String datanasc1, String nome2, String datanasc2){
        if(nome1.equals(nome2) && datanasc1.equals(datanasc2)){
            return true;
        }
        else{
            return false;
        }
    }
}
