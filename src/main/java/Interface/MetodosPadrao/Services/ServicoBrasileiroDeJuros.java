package Interface.MetodosPadrao.Services;

import java.security.InvalidParameterException;

public class ServicoBrasileiroDeJuros implements ServicoJuros{
    private double juros;

    public ServicoBrasileiroDeJuros(double juros){
        this.juros = juros;
    }

    @Override
    public double getServicoJuros() {
        return juros;
    }

}
