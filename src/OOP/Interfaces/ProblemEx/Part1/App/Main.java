package OOP.Interfaces.ProblemEx.Part1.App;

import OOP.Interfaces.ProblemEx.Part1.Model.Entities.CarRental;
import OOP.Interfaces.ProblemEx.Part1.Model.Entities.Vehicle;
import OOP.Interfaces.ProblemEx.Part1.Model.Service.RentalService;
import OOP.Interfaces.ProblemEx.Part1.Model.Service.BrazilTaxService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel:");
        System.out.println("--------------------------------");
        System.out.print("Modelo:");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/mm/yyyy hh:mm):");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dateTimeFormatter);
        System.out.print("Retorno (dd/mm/yyyy hh:mm):");
        LocalDateTime end = LocalDateTime.parse(sc.nextLine(), dateTimeFormatter);

        //composição: construtor dentro de outro
        CarRental carRental = new CarRental(start, end, new Vehicle(carModel));

        System.out.print("Entre com o preço por hora:");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia:");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("FATURA:");
        System.out.println("-------------------");
        System.out.println("Pagamento básico: " + String.format("%.2f", carRental.getInvoice().getBasePayment()));
        System.out.println("Imposto: " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Preço total: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));

        sc.close();
    }
}
