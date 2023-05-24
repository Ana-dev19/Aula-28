package exercicio1;

public class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preço, String codigoDeBarras, String autor) {
        super(nome, preço, codigoDeBarras);
        this.autor = autor;
    }
    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreço());
        System.out.println("Autor: " + autor);
    }
    }

