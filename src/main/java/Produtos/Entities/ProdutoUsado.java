package Produtos.Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

    private Date dataDeFabricacao;

    public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }
    //Etiqueta
    @Override
    public String etiquetaDePreco(){
        return " ## Produto Usado ## "
                + getNome()
                + " R$ "
                + String.format("%.2f", getPreco())
                +" - Data de Fabricação: "
                + sdf.format(dataDeFabricacao);

    }
}
