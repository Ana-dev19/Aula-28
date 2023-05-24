package exercicio1;

public class CD extends Produto {
    private int numeroDeFaixas;

    public CD(String nome, double preço, String codigoDeBarras, int numeroDeFaixas) {
        super(nome, preço, codigoDeBarras);
        this.numeroDeFaixas = numeroDeFaixas;
    }
    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreço());
        System.out.println("Número de faixas: " + numeroDeFaixas);
    }

}
