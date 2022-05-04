package GenericsSetMap.Set.Exemplo04Comparacao.Entities;

import java.util.Objects;

public class Produto {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return Objects.equals(getNome(), produto.getNome()) && Objects.equals(getPreco(), produto.getPreco());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getPreco());
    }
}
