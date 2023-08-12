package OOP.Static.ExStatic3;

import OOP.Static.ExStatic3.Util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Whats is dollar price?");
        CurrencyConverter.dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought");
        CurrencyConverter.valueToBebought = sc.nextDouble();

        System.out.println("Value without tax R$" +CurrencyConverter.valueToBePaid());
        System.out.println("Final value with tax R$" +CurrencyConverter.lessICO());
    }
}
