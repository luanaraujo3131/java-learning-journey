package OOP.Interfaces.Ex.app;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import OOP.Interfaces.Ex.entities.Contract;
import OOP.Interfaces.Ex.entities.Installment;
import OOP.Interfaces.Ex.services.ContractService;
import OOP.Interfaces.Ex.services.PayPalService;

public class Main {
    public static void main(String[] args) throws ParseException{

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Dados do contrato:");
        System.out.println("--------------------");
        System.out.print("Número: ");
        int contractNumber = sc.nextInt();
        System.out.print("Data: ");
        LocalDate date = LocalDate.parse(sc.next(), dateTimeFormatter);
        System.out.print("Valor total do contrato:");
        Double contractValue = sc.nextDouble();

        Contract contract = new Contract(contractNumber, date, contractValue);

        System.out.print("Número de parcelas:");
        Byte n = sc.nextByte();

        ContractService contractService = new ContractService(new PayPalService());

        contractService.processContract(contract, n);

        System.out.println("Parcelas:");
        System.out.println("-----------");
        for(Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }

        sc.close();
    }
}
