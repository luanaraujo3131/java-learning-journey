package Generics.Set.exerciseSet.App;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import Generics.Set.exerciseSet.Entities.Students;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Students> list = new LinkedHashSet<>();
        System.out.println("Choice:");
        String choice = sc.nextLine();
        do{
            System.out.println("Name:" );
            String name = sc.nextLine();
            Students students = new Students(name);
            list.add(students);

            System.out.println("Enter 'Exit' to quit or press Enter to continue:");
            choice = sc.nextLine();
        } while(!choice.equals("Exit"));

        for (Students students : list) {
            System.out.println(students);
        }
    }
}
