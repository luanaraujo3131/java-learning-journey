package OOP.Exercicios.ex2.App;

import OOP.Exercicios.ex2.entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: ");
        employee.name = sc.nextLine();
        System.out.println("Gross salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.println("Tax");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.println("Percentage to increase salary: ");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);

        System.out.println("Updated data: " + employee);
        sc.close();
    }
}
