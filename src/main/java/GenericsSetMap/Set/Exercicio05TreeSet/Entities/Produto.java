package GenericsSetMap.Set.Exercicio05TreeSet.Entities;

import java.util.Locale;

public class Produto implements Comparable<Produto> {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto -  "
                + "nome: "
                + nome
                + ", R$ "
                + preco;
    }


    @Override
    public int compareTo(Produto other) {
        return nome.toUpperCase().compareTo(other.getNome().toLowerCase());
    }
}
