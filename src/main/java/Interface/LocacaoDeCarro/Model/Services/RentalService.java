package Interface.LocacaoDeCarro.Model.Services;

import Interface.LocacaoDeCarro.Model.Entities.CarRental;
import Interface.LocacaoDeCarro.Model.Entities.Invoice;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

      //Classe responsavel por gerar a nota de pagamento do aluguel do carro - Retorna o valor basico de pagamento
    public void processInvoice(CarRental carRental){
        //pegar valor em ms de cada data
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        //Recebe a diferença em horas da t1 e t2
        double hours = (double)(t2 - t1) / 1000 / 60 / 60;


        double basicPayment;
        if(hours <= 12.0){
            basicPayment = Math.ceil(hours) * pricePerHour;
        }else {
            basicPayment = Math.ceil(hours / 24) * pricePerDay;
        }
        //calcula o valor do imposto
        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }

}
