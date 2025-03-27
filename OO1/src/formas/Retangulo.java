package formas;

public class Retangulo {
    private int x;
    private int y;
    private int largura;
    private int altura;

    public Retangulo(int x, int altura, int largura, int y) {
        this.x = x;
        this.altura = altura;
        this.largura = largura;
        this.y = y;
    }

    public void mover(int novox, int novoy){
        x = novox;
        y = novoy;
    }

    public void desenhar(){
        System.out.printf("Retangulo: (%d, %d, %d, %d)\n", x, y, altura, largura);
    }

    public void redimensionar(float sx, float sy){
        if(sx > 0 && sy > 0){
            largura = (int) (sx / 100 * largura);
            altura = (int) (sy / 100 * altura);
        }
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

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
