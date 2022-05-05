package ProgramacaoFuncionalELambidas.Comparator.Entities;

import java.util.Locale;

public class Products  {
    private String nome;
    private Double preco;

    public Products(String nome, Double preco) {
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
        return "Products{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

}
