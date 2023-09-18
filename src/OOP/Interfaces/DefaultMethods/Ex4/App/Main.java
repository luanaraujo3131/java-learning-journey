package OOP.Interfaces.DefaultMethods.Ex4.App;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import OOP.Interfaces.DefaultMethods.Ex4.Service.BrazilInterestService;
import OOP.Interfaces.DefaultMethods.Ex4.Service.InterestService;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float amount = 0.0f;
        byte months = 0;

        try{
            System.out.print("Amount: ");
            amount = sc.nextFloat();
            System.out.print("Months: ");
            months = sc.nextByte();
        } catch(InputMismatchException e){
            System.out.println("Number of months not allowed!");
        } //variavéis do tipo byte só aceitam números de 8bits algo próximo a números de -128 a 127.

        InterestService brazilInterestService = new BrazilInterestService((float) 2.0);
        //criando um obj com o nome da interface
        //UsaInterestService usaInterestService = new UsaInterestService((float) 1.0);
        float payment = brazilInterestService.payment(amount, months);

        System.out.println("Payment after " +months+ " months: " +String.format("%.2f", payment));

        sc.close();
    }
}
