package OOP.Exercicios.ex3;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = JOptionPane.showInputDialog("Name: ");
        student.grade1 = Double.parseDouble(JOptionPane.showInputDialog("Grade1: "));
        student.grade2 = Double.parseDouble(JOptionPane.showInputDialog("Grade2: "));
        student.grade3 = Double.parseDouble(JOptionPane.showInputDialog("Grade3: "));

        System.out.printf("Final grade: %.2f%n", student.finalGrade());

        if(student.finalGrade() < 60.0){
            System.out.println("Failed");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
