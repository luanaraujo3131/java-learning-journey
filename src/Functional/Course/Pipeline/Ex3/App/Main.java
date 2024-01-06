/*
 * Make a program to read the data (name, email and salary)
 * of employees from a file in .csv format.
 * Then show, in alphabetical order, the email addresses of the
 * employees whose salary exceeds a given amount
 * provided by the user.
 * Also show the sum of shifts of employees whose name
 * name starts with the letter 'M'.
 */

package Functional.Course.Pipeline.Ex3.App;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import Functional.Course.Pipeline.Ex3.Entities.Employee;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String pathOfFIle = "EmployeesForStreamTestEx3.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathOfFIle))) {
            List<Employee> list = new ArrayList<>();
            
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(", ");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = bufferedReader.readLine();
            }
            System.out.println("Employees: \n" +list);

            System.out.println("Write a salary: ");
            double value = sc.nextDouble();

            Comparator<String> namesOfEmployees = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> salaryLessThanValue = list.stream()
                                        .filter(e -> e.salary()<= value)
                                        .map(e -> e.email())
                                        .sorted(namesOfEmployees)
                                        .collect(Collectors.toList());

            if(salaryLessThanValue.isEmpty()){
                System.out.printf("No employee receives less %.2f%n", value);
            } else{                 
                System.out.println("Email of people whose salary is less than " + String.format("%.2f", value) + ":");      
                salaryLessThanValue.forEach(System.out::println);
            }    
            
            Double sum = list.stream()
                        .filter(e -> e.name().charAt(0) == 'M')  
                        .map(e -> e.salary())
                        .reduce(0.0, (x, y) -> x + y); 
            System.out.printf("Sum of salary from people whose name starts with 'M': %.2f%n", sum);    

        } catch (Exception e) {
            System.out.println("Erro " +e.getMessage());
        }
    }
}
