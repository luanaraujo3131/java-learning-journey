package OOP.Interfaces.ProblemEx.Part1.Model.Service;

public class BrazilTaxService implements TaxService{
    public double tax(double amount){
        if (amount <= 100){
            return amount * 0.2; //20%
        } else {
            return amount * 0.15;
        }
    }
}
