package OOP.Abstract.Ex1.App;

import OOP.Abstract.Ex1.Entities.Account;
import OOP.Abstract.Ex1.Entities.BusinessAccount;
import OOP.Abstract.Ex1.Entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1234, "Luan", 500.00, 0.01));
        list.add(new BusinessAccount(789, "Maria", 1000.00, 400.0));
        list.add(new SavingsAccount(456, "João", 300.00, 0.01));
        list.add(new BusinessAccount(1011, "Joana", 500.00, 500.0));

        float sum = 0f;
        for (Account acc : list) {
            sum += acc.getBalance();
        }
        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc : list) {
            acc.deposit(100.0);//deposita 100 em todas as contas
        }
        for (Account acc: list) {
            System.out.printf("Valores da conta %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }
}
