package OOP.Inheritance.Account.entities;

public class Account {

    private Integer number;
    private String holder;
    protected Double balance;

    public Account(){}

    public Account(Integer number, String holder, Double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * Suppose the withdrawal amount has a rate of 5.0. However, if the account is a savingsAccount,
     * the fee should not be charged.
     * To do this, let's @Override the withDraw method in the savingaccount class
     * */
    public void withDraw(Double amount){
        balance -= amount + 5;
        //here I do the entire implementation
    }

    public void deposit(Double amount){
        balance += amount;
    }
}
