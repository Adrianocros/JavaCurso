package ProgramaDePedidos.Entities;

public class ItensDoPedido {
    private Integer quantidade;
    private Double preco;
    private Produtos produtos;

    public ItensDoPedido(){

    }

    public ItensDoPedido(Integer quantidade, Double preco, Produtos produtos) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produtos = produtos;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    public Double subTotal(){
        return preco * quantidade;
    }
    @Override
    public String toString(){
        return "Nome do produto: "
                +getProdutos().getNome()
                + ",Valor R$ "
                + String.format("%.2f", preco)
                + ", Quantidade vendida: "
                + quantidade
                + ", SubTotal R$ "
                + String.format("%.2f", subTotal());
    }

}
