package OOP.Interfaces.Ex.services;

import java.time.LocalDate;

import OOP.Interfaces.Ex.entities.Contract;
import OOP.Interfaces.Ex.entities.Installment;

public class ContractService{

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }
    
    public void processContract(Contract contract, Byte month){
        double basicQuota = contract.getTotalValue() / month;

        for(byte i = 1; i <= month; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }
}
