package OOP.Interfaces.DefaultMethods.Ex4.Service;

public class BrazilInterestService implements InterestService{
   
    private float interestRate;
    
    public BrazilInterestService(float interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public float getInterestRate() {
        return interestRate;
    }
}
