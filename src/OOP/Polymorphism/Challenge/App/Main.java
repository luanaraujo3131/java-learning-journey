package OOP.Polymorphism.Challenge.App;

import OOP.Polymorphism.Challenge.Entities.Employee;
import OOP.Polymorphism.Challenge.Entities.OutSourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeesList = new ArrayList<>();

        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Employee #" + i + " data:");
            System.out.println("------------------------");
            System.out.print("Outsource? (Y/N):");
            char choice = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour:");
            double valuePerHour = sc.nextDouble();

            if (choice == 'Y' || choice == 'y'){
                System.out.print("Additional Charge");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutSourceEmployee(name, hours, valuePerHour, additionalCharge);
                employeesList.add(emp);
           } else if(choice == 'N' || choice == 'n'){
                //if we do this, we don't have to make a variable like above
                employeesList.add(new Employee(name, hours, valuePerHour));
            } else {
                System.out.println("Try again!!");
            }
        }

        System.out.println();
        System.out.println("Payments:");
        System.out.println("----------------");
        for (Employee employee : employeesList){
            System.out.println(employee.getName()+ " - US$" +String.format("%.2f", employee.payment()));
        }

        sc.close();
    }
}
