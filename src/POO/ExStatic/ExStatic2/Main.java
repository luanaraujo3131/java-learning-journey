package POO.ExStatic.ExStatic2;

import POO.ExStatic.ExStatic2.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator(); //creating the object

        System.out.println("Enter the radius:");
        double radius = sc.nextDouble();

        double c = calc.cincurference(radius); //calling the especific method from object calc
        double v = calc.volume(radius); //same stuff

        System.out.printf("Cincurference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", calc.PI); //same stuff

        sc.close();
    }
}
//WHEN WE DO NOT USE STATIC, AND WE WANT TO CALL SOME OBJECT, FIRST OF ALL, WE GOTTA CREATE A NEW OBJECT
//THEN, CALL THE SPECIFIC METHODS WE WANT TO USE(ALL THE TIME). IF OUR OBJECT WERE IN ANORTHER FILE, LIKE THIS
//AND WERE STATIC, WE WOULD HAVE TO CALL THE CLASS
//ON EXSTATIC1 I DID NOT DO THIS, BECAUSE WERE ON SAME FILE(PROGRAM), BUT, IF WERE LIKE THIS WHERE MY CLASS
//(CALCULATOR) IS ON "UTIL", I WOULD HAVE TO CALL THE CLASS:
// @code     Calculator.cincurference
//           Calculator.volume ....
//THE DIFERENCE IS THAT I DON'T HAVE TO CREATE AN OBJECT
