/**Downcasting and upcasting*/

package OOP.Inheritance.Account.entities;

//Test keyword "Final"
//The "FINAL" prevents a class from being inherited
//Prevents a method from being Override
public final class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){}

    public SavingsAccount(Integer number, String holder,
                          Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    /**
     * @Override
     * public FINAL void withDraw(Double amount){
     *     balance -= amount
     * }
     * if we do this(with FINAL), we can't change this method in another place*/
    @Override
    public void withDraw(Double amount) {
        balance -= amount;
        //the withDraw WITHOUT the fee of 5.0, the @override is to iforme compiler and other programmers
        //that this method is Override (oh, here we have Sherlock Holmes.... LOL).
        //Note that we have the same method, with the same name, but with the different implementation, because
        // of this we have @Override
    }
}
