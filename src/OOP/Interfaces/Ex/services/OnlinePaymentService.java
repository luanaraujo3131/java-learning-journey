package OOP.Interfaces.Ex.services;

public interface OnlinePaymentService {
    
    public double paymentFee(Double amount);
    public double interest(Double amount, Byte months);//juros
}
