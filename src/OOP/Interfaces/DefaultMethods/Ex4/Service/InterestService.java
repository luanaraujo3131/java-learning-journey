package OOP.Interfaces.DefaultMethods.Ex4.Service;

import java.security.InvalidParameterException;

public interface InterestService {
    float getInterestRate();
    default float payment(float amount, byte months){
        if(months < 1)
            throw new InvalidParameterException("Entre com um número de meses válido");
        return (float) (amount * Math.pow(1 + getInterestRate() / 100, months));    
    }
}
