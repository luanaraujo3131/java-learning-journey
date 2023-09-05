package Enumeration.Composition.Composition1.app;

import Enumeration.Composition.Composition1.entities.Departament;
import Enumeration.Composition.Composition1.entities.HourContract;
import Enumeration.Composition.Composition1.entities.Worker;
import Enumeration.Composition.Composition1.entities_enum.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");

        System.out.println("Enter the departatment's name: ");
        String dptName = sc.nextLine();
        System.out.println("Enter the worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),
                        baseSalary, new Departament(dptName));
                                    //departament is associated with a worker
        System.out.print("How much contracts to this worker? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println("Enter the contract #"+i+" data:");
            System.out.print("Date(dd/mm/yyyy): ");
            Date contractDate = simpleDateFormat.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration(hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);//contract is associated with a worker
        }

        System.out.println();
        System.out.print("Enter the month and year to calculate income (mm/yyyy):");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("-------------------");
        System.out.println("Name: " +worker.getName());
        System.out.println("Departament: " +worker.getDepartament().getName());
        System.out.println("Income for "+monthAndYear+": "+String.format("%.2f", worker.income(month, year)));

        sc.close();
    }
}
