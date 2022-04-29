package Interface.MetodosPadrao.Services;

import java.security.InvalidParameterException;

public class ServicoAmericanoDeJuros {
    private double juros;

    public ServicoAmericanoDeJuros(double juros){
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    //Função de pagamento
    public double pagamento(double montante, int meses){
        if(meses < 1){
            throw new InvalidParameterException("Quantidade de meses deve ser maior que 0 (zero) ! ");
        }
        return montante * Math.pow(1.0 + juros / 100.0, meses );
    }


}
