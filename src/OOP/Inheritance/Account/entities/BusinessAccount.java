package OOP.Inheritance.Account.entities;

/**
 * The relationship between a superclass and a subclass is "Is one", repair: every BusinessAcount
 * is an Account. A dog that extends from Animal class means that the dog is an animal. Actually, it's
 * simpler than it seems
 * */
public class BusinessAccount extends Account{
    /**It has all Account's methods and attributes. All we have to do is add
     * what BusinessAccount has and Account doesn't.
     */
    private Double loanLimit;

    public BusinessAccount(){}

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); //it calls methods from Account, my parent class
        this.loanLimit = loanLimit;//here we add what BusinessAccount has and Account doesn't
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loadLimit) {
        this.loanLimit = loadLimit;
    }

    /**suppose that one of the core is that for each loan, a rate of U$10 is discounted
     * if we want to put this rule here, we can't use private, because the private defines that
     * attributes are only accessed on its class, so even we extend from this class, it ain't possible
     * access it. To do this, or we use public or, if we want to protect our attributes and methods like private,
     * we use protected.*/
    public void loan(double amount){
        if (amount <= loanLimit){
            //deposit(amount);
            balance += amount - 10;
        } else {
            System.out.println("Loan limit = " +loanLimit);
        }
    }

    /**Suppose that, business account, the withdrawal rule is to perform the withdrawal normally from
     * the superclass and discount 2.0
     */
    @Override
    public void withDraw(Double amount) {
        super.withDraw(amount);//Normal withdrar method from Account class
        balance -= 2; // - 2
    }
}
