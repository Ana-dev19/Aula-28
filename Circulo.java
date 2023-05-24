package exercicio2;

public class Circulo extends Forma {
    private float raio;
    public Circulo(float lado, float lado1) {
        super(lado, lado1);
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * Math.pow(raio,2));
    }

    @Override
    public float cacularPerimetro() {
        return (float) (2 * Math.PI * raio);
    }
}
