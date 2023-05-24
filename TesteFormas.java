package exercicio2;

public class TesteFormas {
    public static void main(String[] args) {
        Forma[] formas = new Forma[5];

        formas[0] = new Retangulo(3, 4);
        formas[1] = new Circulo(4,5);
        formas[2] = new Quadrado(2);
        formas[3] = new Retangulo(5, 6);
        formas[4] = new Circulo(3,4);

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        System.out.println("Perímetro: " + forma.cacularPerimetro());
            System.out.println("-----------------------------");
        }


    }
}
