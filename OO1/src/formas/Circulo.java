package formas;

public class Circulo {
    private int x;
    private int y;
    private float raio;


    public Circulo(int x, int y, float raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo(Circulo outro){
        this.x = outro.x;
        this.y = outro.y;
        this.raio = outro.raio;
    }

    public void mover(int novox, int novoy){
        x = novox;
        y = novoy;
    }

    public void desenhar(){
        System.out.printf("Circulo: (%d, %d, %f)\n", x, y, raio);
    }

    public void redimensionar(float porcentagem){
        this.raio = raio * (porcentagem / 100);
    }


    public void dividir(int divisor){
        x = x / divisor;
        y = y / divisor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
