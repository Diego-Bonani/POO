package classes;

public class Sequencia {
    private int primeiro;
    private int ultimo;

    public Sequencia (int primeiro, int ultimo){
        if(primeiro > ultimo){
            this.primeiro = ultimo;
            this.ultimo = primeiro;
        }
        else{
            this.primeiro = primeiro;
            this.ultimo = ultimo;
        }
    }

    public void mostrar(){
        mostrar(1);
    }

    public void mostrar(int variacao){
        for (int i = 0; i < ultimo; i = i + variacao) {
            System.out.println(primeiro + i);
        }
    }
}
