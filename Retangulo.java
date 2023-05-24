package exercicio2;

public class Retangulo extends Forma {
    private float lado;
    private float altura;

    public Retangulo(float lado, float altura) {
        super(lado, altura);
        this.lado = lado;
        this.altura= altura;
    }
    public float getLado(){
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return lado * altura;
    }

    @Override
    public float cacularPerimetro() {
        return 2 * (lado + altura);
    }
}
