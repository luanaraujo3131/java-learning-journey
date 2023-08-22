package OOP.Inheritance.Account.app;

import OOP.Inheritance.Account.entities.Account;
import OOP.Inheritance.Account.entities.BusinessAccount;
import OOP.Inheritance.Account.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1001, "Peter Parker", 0.0);
        BusinessAccount businessAccount1 = new BusinessAccount(2001, "Steve Rogers", 2500.00, 500.0);

        //UPCASTING
        Account acc = businessAccount1;
        Account businessAccount2 = new BusinessAccount(3001, "Bruce Wayne", 10000.0, 5000.0);
        Account acc1 = new SavingsAccount(4001, "Tony Stark", 15000.0, 0.2);
        /**Note that we're creating Business and Savings accounts directly from superclass (ACCOUNT)
         * So we don't need to write businessAccount... we can just create our objects from superclass
         * this is one possible stuff that polymorphism allows us to do.
         * NOTE: INHERITANCE RELATION IS ALWAYS "IS ONE"
         * A BUSINESS ACCOUNT IS STILL AN ACCOUNT.
         */

        //DOWNCASTING
        BusinessAccount businessAccount3 = (BusinessAccount) businessAccount2;
        businessAccount3.loan(100.0);
        //BusinessAccount businessAccount3 = businessAccount2; Error!! Because I declared with "Account"
        //So, if we want to force this cast, we have to do it manually

        if (acc1 instanceof BusinessAccount){
            BusinessAccount businessAccount4 = (BusinessAccount) acc1;
            businessAccount4.loan(200.00);
            System.out.println("Loan! It worked!!!!!!!!!!");
        }
        if (acc1 instanceof SavingsAccount){
            SavingsAccount acc2 = (SavingsAccount) acc1;
            acc2.updateBalance();
            System.out.println("Updated!!!!! because acc1 is not a instance of BusinessAccount.");
        }

        //About override test::
        Account account5 = new Account(5001, "Diana Prince", 1000.0);
        account5.withDraw(200.0);//1000 - 200 - 5 (5 is the fee) == 795
        System.out.println(account5.getBalance());

        Account testSavingsAccount = new SavingsAccount(6001, "Peter Pan", 1000.0, 0.01);
        testSavingsAccount.withDraw(200.0);//100 - 200 = 800. There is no fee(5)for Saving Accounts
        System.out.println(testSavingsAccount.getBalance());

        //SuperTest
        Account testBusinessAccount = new BusinessAccount(7001, "Sam Wilson", 2500.0, 500.0);
        testBusinessAccount.withDraw(200.0);//2500 - 200 - 2 =
        System.out.println(testBusinessAccount.getBalance());
    }
}
