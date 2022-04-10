package Produtos.Entities;

public class ProdutoImportado extends Produto{
    private Double valorAlfandega;

    public ProdutoImportado(String nome, Double preco, Double valorAlfandega) {
        super(nome, preco);
        this.valorAlfandega = valorAlfandega;
    }

    public Double getValorAlfandega() {
        return valorAlfandega;
    }

    public void setValorAlfandega(Double valorAlfandega) {
        this.valorAlfandega = valorAlfandega;
    }

    public Double precoTotal(){
        return getPreco() + valorAlfandega;
    }

    //Etiqueta
    @Override
    public String etiquetaDePreco(){
        return " ## Produto Importado ## "
                + getNome()
                + " R$ "
                + String.format("%.2f",precoTotal());
    }

}
