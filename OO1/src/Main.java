import formas.Circulo;
import formas.Retangulo;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Retangulo r1, r2;
        Circulo c1, c2, c3;

        r1 = new Retangulo(10, 200, 100, 20);

        r2 = new Retangulo(teclado.nextInt(), teclado.nextInt(), teclado.nextInt(), teclado.nextInt());

        c1 = new Circulo(20, 25, 8);

        c2 = new Circulo(c1);

        c3 = new Circulo(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());

        c3.desenhar();

        c2.desenhar();

        c1.mover(5, 10);

        c1.desenhar();

        r1.mover(4, 5);

        r2.desenhar();

        r1.redimensionar(15, 25);

        r2.dividir(2);
    }
}