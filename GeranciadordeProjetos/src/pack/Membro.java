package pack;

public class Membro {
    private String nome;
    private String datanasc;
    private int salario;

    public Membro(String nome, String datanasc, int salario) {
        this.nome = nome;
        this.datanasc = datanasc;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public int getSalario() {
        return salario;
    }

    public void imprimir(){
        System.out.println(nome);
        System.out.println(datanasc);
        System.out.println(salario);
    }
}
