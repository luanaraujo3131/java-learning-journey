package OOP.Interfaces.DefaultMethods.Ex4.Service;

public class UsaInterestService implements InterestService{

    private float interestRate;
    
    public UsaInterestService(float interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public float getInterestRate() {
        return interestRate;
    }
}
