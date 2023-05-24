package exercicio1;

public class DVD extends Produto {
    private int duração;
    public DVD(String nome, double preço, String codigoDeBarras, int duração) {
        super(nome, preço, codigoDeBarras);
        this.duração = duração;
    }
    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreço());
        System.out.println("Duração: " + duração);

    }
}
