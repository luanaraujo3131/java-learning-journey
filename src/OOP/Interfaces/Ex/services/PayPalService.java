package OOP.Interfaces.Ex.services;

public class PayPalService implements OnlinePaymentService{

    @Override
    public double paymentFee(Double amount) {
        return amount * 0.02; //2%
    }

    @Override
    public double interest(Double amount, Byte months) {
        if(amount < 0.0){
            throw new IllegalArgumentException(">=0");
        } else{
            return amount * 0.01 * months;
        }    
    }   
}
