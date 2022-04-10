package ExercicioPolimorfismo.Entities;


public class FuncTerceiro extends Funcionario{
    private Double cobrancaAdicional;

    public FuncTerceiro(){
        super();
    }

    public FuncTerceiro(String nome, Integer hora, Double valorHora, Double cargaAdicional) {
        super(nome, hora, valorHora);
        this.cobrancaAdicional = cargaAdicional;
    }

    public Double getCargaAdicional() {
        return cobrancaAdicional;
    }

    public void setCargaAdicional(Double cargaAdicional) {
        this.cobrancaAdicional = cargaAdicional;
    }

    //Sobrescrevendo o pagamento da classe funcionario
    @Override
    public double pagamento(){
        return super.pagamento() + cobrancaAdicional * 1.1;
    }
}
