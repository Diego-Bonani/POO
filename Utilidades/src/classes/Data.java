package classes;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void imprime(){
        if(ehValida()) {
            System.out.printf("%d/%d/%d", dia, mes, ano);
        }
        else{
            System.out.println("Data inválida");
        }
    }

    public boolean ehValida(){
        return dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0;
    }

    public boolean ehBissexto(){
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
    }
}
