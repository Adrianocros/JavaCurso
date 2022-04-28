package Interface.EmpPagtoOnLine.Services;

//declaração de metodos para inteface dos serviços de pagamentos
public interface OnlinePaymentService {
    double paymentFee(double amount);
    double interest(double amount, int months);

}
