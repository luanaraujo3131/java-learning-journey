package Exceptions.Account.App;

import Exceptions.Account.Model.Entities.Account;
import Exceptions.Account.Model.Exceptions.ModelException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ModelException {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the account data:");
            System.out.print("Number:");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder:");
            String holder = sc.nextLine();
            System.out.print("Initial balance:");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit:");
            double withdrawLimite = sc.nextDouble();

            Account acc = new Account(number, holder, initialBalance, withdrawLimite);

            char option;
            do {
                System.out.println("1. Deposit \n2. Withdraw \n3. Exit");
                option = sc.next().charAt(0);
                switch (option) {
                    case '1':
                        System.out.println("Amount: ");
                        double amount = sc.nextDouble();
                        acc.deposit(amount);
                        break;
                    case '2':
                        System.out.println("Value:");
                        amount = sc.nextDouble();
                        acc.withDraw(amount);
                        break;
                    case '3':
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            } while (option != '3');

            System.out.println("New balance: " + acc.getBalance());
            System.out.println(acc);
        } catch (ModelException e){
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        } catch (RuntimeException e){
            System.out.println("Unexpected error!");
        }
    }
}
