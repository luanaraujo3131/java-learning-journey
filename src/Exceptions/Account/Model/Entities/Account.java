package Exceptions.Account.Model.Entities;

import Exceptions.Account.Model.Exceptions.ModelException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimite;

    public Account(){}

    public Account(Integer number, String holder, Double balance, Double withDrawLimite) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimite = withDrawLimite;
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
        balance = balance;
    }

    public Double getWithDrawLimite() {
        return withDrawLimite;
    }

    public void setWithDrawLimite(Double withDrawLimite) {
        this.withDrawLimite = withDrawLimite;
    }

    public void deposit(Double amount){
        amount += balance;
    }

    public void withDraw(Double amount) throws ModelException {
        if (amount < balance){
            throw new ModelException("insufficient balance");
        } else if(amount > withDrawLimite){
            throw new ModelException("withdrawal limit: " +getWithDrawLimite());
        } else {
            amount -= balance;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                ", withDrawLimite=" + withDrawLimite +
                '}';
    }
}
