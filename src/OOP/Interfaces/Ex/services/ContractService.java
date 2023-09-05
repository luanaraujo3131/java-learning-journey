package OOP.Interfaces.Ex.services;

public class ContractService implements OnlinePaymentService{

    @Override
    public Double paymentFee(Double amount) {
        throw new UnsupportedOperationException("Unimplemented method 'paymentFee'");
    }
    @Override
    public Double interest(Double amount, Integer months){
        throw new UnsupportedOperationException("test");
    }
}
