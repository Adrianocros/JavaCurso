package ExercicioImposto.Entities;

public class Individual extends Contribuinte{

    private Double gastoComSaude;

    public Individual(Double gastoComSaude) {
        super();
    }

    public Individual(String nome, Double rendaAnual, Double gastoComSaude) {
        super(nome, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    public Double getGastoComSaude() {
        return gastoComSaude;
    }

    public void setGastoComSaude(Double gastoComSaude) {
        this.gastoComSaude = gastoComSaude;
    }


    @Override
    public Double taxa() {
        if(getRendaAnual() < 20000.0){
            return getRendaAnual() * 0.15 - gastoComSaude * 0.5;
        }else {
            return getRendaAnual() * 0.25 - gastoComSaude * 0.5;
        }

    }
}
