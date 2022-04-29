package Interface.MetodosPadrao.Services;

import java.security.InvalidParameterException;

public class ServicoAmericanoDeJuros implements ServicoJuros {
    private double juros;

    public ServicoAmericanoDeJuros(double juros){
        this.juros = juros;
    }

    @Override
    public double getServicoJuros() {
        return juros;
    }

}
