package exercicio1;

public class Loja {

    public static void main(String[] args) {

        Produto[] produtos = new Produto[5];


        produtos[0] = new Livro("O Senhor dos Anéis", 60.0, "123456789", "J.R.R Tolkien");
        produtos[1] = new CD("Madona", 30.0, "123456789", 10);
        produtos[2] = new DVD("Divergente", 30, "345678567", 120);
        produtos[3] = new Livro("Cronicas de Nárnia", 70.0, "123456789", "C.S. Lewis");


        for (Produto produto : produtos) {
            produto.mostrarDetalhesDoItem();
            System.out.println();
            System.out.println("----------------------------------------");

        }

            }
        }
