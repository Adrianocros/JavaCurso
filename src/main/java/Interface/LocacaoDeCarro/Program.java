package Interface.LocacaoDeCarro;

import Interface.LocacaoDeCarro.Model.Entities.CarRental;
import Interface.LocacaoDeCarro.Model.Entities.Vehicle;
import Interface.LocacaoDeCarro.Model.Services.BrazilTaxService;
import Interface.LocacaoDeCarro.Model.Services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Informe a data de locação");
        System.out.print("Modelo do veiculo: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:ss): ");
        Date start = sdf.parse(sc.nextLine());
        System.out.print("Devolução (dd/MM/yyyy hh:ss): ");
        Date finish = sdf.parse(sc.nextLine());

        CarRental cr = new CarRental(start,finish,new Vehicle(carModel));


        System.out.print("Informe o preço por hora:");
        double pricePerHour = sc.nextDouble();
        System.out.print("Informe o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay,pricePerHour,new BrazilTaxService());

        rentalService.processInvoice(cr);
        System.out.println();
        System.out.println("Fatura");
        System.out.println("Pagamento basico: " + String.format("%.2f",cr.getInvoice().getBasicPayment()));
        System.out.println("Taxa: " + String.format("%.2f",cr.getInvoice().getTax()));
        System.out.println("Pagamento total : " + String.format("%.2f",cr.getInvoice().getTotalPayment()));

    }
}
