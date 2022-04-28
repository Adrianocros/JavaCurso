package Interface.EmpPagtoOnLine;

import Interface.EmpPagtoOnLine.Entities.Contract;
import Interface.EmpPagtoOnLine.Entities.Installment;
import Interface.EmpPagtoOnLine.Services.ContractService;
import Interface.EmpPagtoOnLine.Services.OnlinePaymentService;
import Interface.EmpPagtoOnLine.Services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com Contrato");
        System.out.print("Numero:");
        Integer number = sc.nextInt();
        System.out.print("Entre com a data (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Entre com valor do contraro: ");
        Double totalValue = sc.nextDouble();

        Contract contract = new Contract(number,date,totalValue);

        System.out.print("Entre com numero de parcelas: ");
        int N = sc.nextInt();

        ContractService cs = new ContractService(new PaypalService());
        cs.processContract(contract,N);

        System.out.println("#### Parcelas ###");
        for (Installment it : contract.getInstallments()){
            System.out.println(it);
        }






    }
}
