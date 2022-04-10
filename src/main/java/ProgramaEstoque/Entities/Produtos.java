package ProgramaEstoque.Entities;

public class Produtos {
    public String nome;
    public double preco;
    public int quantidade;

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
