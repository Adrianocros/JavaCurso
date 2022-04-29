package Interface.MetodosPadrao.Services;

import java.security.InvalidParameterException;

public interface ServicoJuros {
    double getServicoJuros();

    //Função de pagamento
    default double pagamento(double montante, int meses){
        if(meses < 1){
            throw new InvalidParameterException("Quantidade de meses deve ser maior que 0 (zero) ! ");
        }
        return montante * Math.pow(1.0 + getServicoJuros() / 100.0, meses );
    }

}
