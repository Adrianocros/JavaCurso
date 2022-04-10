package ProgramaContas.entities;

public class ContaNegocios extends Conta {
    private Double limite;

    public ContaNegocios(){
        super();
    }

    public ContaNegocios(Integer numero, String cliente, Double saldo, Double limite) {
        super(numero, cliente, saldo);
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }


    public void emprestimo(double montante){
        if(montante <= limite){
            saldo += montante - 10.0;
        }

    }
    @Override
    public void saque(double montante){
        super.saque(montante);
        saldo -= 2.0;
    }

}
