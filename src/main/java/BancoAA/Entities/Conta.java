package BancoAA.Entities;

public class Conta {
    private String nome;
    private int numConta;
    private double balancete;

    public Conta(String nome, int numConta) {
        this.nome = nome;
        this.numConta = numConta;
    }

    public Conta(String nome, int numConta, double depInicial) {
        this.nome = nome;
        this.numConta = numConta;
        deposito(depInicial);

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

   public void deposito(double montante){
        balancete += montante;
    }

    public  void retirada(double montante){
        balancete -= montante + 5.0;
    }


    public String toString() {
        return "Conta "
                + numConta
                + ", Nome Correntista: "
                + nome
                +", Total R$  : "
                + String.format("%.2f%n", balancete);
    }
}
