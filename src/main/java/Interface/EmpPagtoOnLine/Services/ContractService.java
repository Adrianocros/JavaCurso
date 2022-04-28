package Interface.EmpPagtoOnLine.Services;

import Interface.EmpPagtoOnLine.Entities.Contract;
import Interface.EmpPagtoOnLine.Entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService{

    private OnlinePaymentService onlinePaymentService;

    //Injetando a dependencia.
    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    //Responsavel pelas parecelas contrato e add juros e alterando datas.
    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValues() / months;
        for(int i = 1; i<= months; i++){
            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
            Date dueDate = addMoths(contract.getDate(),i);
            contract.getInstallments().add(new Installment(dueDate,fullQuota));
        }
    }
    //Função auxiloar para add meses a uma data
    private Date addMoths(Date date, int N){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, N);
        return calendar.getTime();
    }
}
