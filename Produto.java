package exercicio1;

import java.util.Objects;

public abstract class Produto {
    public abstract void mostrarDetalhesDoItem();
    private String nome;
    private double preço;
    private String codigoDeBarras;

    public Produto(String nome, double preço, String codigoDeBarras) {
        this.nome = nome;
        this.preço = preço;
        this.codigoDeBarras = codigoDeBarras;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return  false;
        }
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.codigoDeBarras,other.codigoDeBarras)) {
            return false;
        }
        return true;
        }
    }