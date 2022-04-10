package Dolar.Utilities;

public class Calculos {
    public double valorDolar;
    public double quantCompra;
    public double taxa = 6.0 /100;

    public double valDolarFinal(){
        return  valorDolar + (taxa * valorDolar);
    }

    public double pagar(){
        return quantCompra * valDolarFinal();
    }

}
