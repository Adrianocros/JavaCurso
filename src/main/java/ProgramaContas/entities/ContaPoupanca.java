package ProgramaContas.entities;

public class ContaPoupanca extends Conta {
    private double taxaDeJuros;


    public ContaPoupanca(){
        super();
    }

      public ContaPoupanca(Integer numero, String cliente, Double saldo, double taxaDeJuros) {
        super(numero, cliente, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    //Atualiza o saldo com base na taxa de juros
    public void atualizaSaldo(){
        saldo += saldo * taxaDeJuros;
    }
    //sobrescrvendo o função saque sa conta.
    @Override
    public void saque(double montante){
        saldo -= montante;
    }

}
