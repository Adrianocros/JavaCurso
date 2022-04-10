package CalculoMcPiscina.Entities;

public class MetrosCubicos {
    private Double comprimento;
    private Double largura;
    private Double profundidade;

    public MetrosCubicos(Double comprimento, Double largura, Double profundidade) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }


    public Double calculo(){
        return comprimento * largura * profundidade;
    }

    public String toString(){
        return "Sua piscina precisa de "
                + String.format("%.2f",calculo())
                +" m³ de água."
                + " ou "
                + String.format("%.3f",calculo())
                + " Litros";
    }

}
