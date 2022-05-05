package ProgramacaoFuncionalELambidas.Predicate.Entities;

public class Product {
    private String nome;
    private Double preco;

    public Product(String nome, Double preco) {
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

    //Metodo pega o produto e retorna booleam
    public static boolean staticProductPredicate(Product p){
        return p.getPreco() >= 100.0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
