package OOP.Abstract.Ex1.Entities;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount(){}

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loadLimit) {
        this.loanLimit = loadLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit){
            balance += amount - 10;
        } else {
            System.out.println("Loan limit = " +loanLimit);
        }
    }

    @Override
    public void withDraw(Double amount) {
        super.withDraw(amount);
        balance -= 2;
    }
}