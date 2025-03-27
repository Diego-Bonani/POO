import classes.Sequencia;
import classes.Data;

public class Main {

    public static void main(String[] args) {
        Sequencia s1, s2, s3, s4;
        Data d1, d2, d3;

        s1 = new Sequencia( 2, 6);
        s2 = new Sequencia( 4, 10);
        s3 = new Sequencia(0, 15);
        s4 = new Sequencia(0, 10);

        d1 = new Data(31, 9, 2014);
        d2 = new Data(22, 7, 1990);
        d3 = new Data(17, 5, 2003);

        s1.mostrar();
        s2.mostrar();
        s3.mostrar();
        s4.mostrar();

        System.out.printf("A data é %b", d1.ehValida());
        System.out.printf("A data é %b", d2.ehValida());
        System.out.printf("A data é %b", d3.ehValida());
        d1.imprime();
    }

}