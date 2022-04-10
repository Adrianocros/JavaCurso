package ProgramaEstoqueMelhoria.Entities;

public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor para proteger as classe e não deixar vir vazia
    public Produtos(String nome, double preco, int quantidade){
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
    }
    //Construtor sobrecarregado
    public  Produtos(String nome,double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    //Valor total do estoque
    public double valorTotalEstoque(){
        return preco * quantidade;
    }

    //Adicionando produtos e alterando a quantidade
    public void addProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    //Remover produtos do estoque
    public void removendoProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome + ", R$ "
                + String.format("%.2f",preco)
                + ", "
                + quantidade
                + " unidades, Total Estoque: R$ "
                + String.format("%.2f", valorTotalEstoque());
    }


}
