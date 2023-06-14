package POO.Exercicios.ex1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Digite a altura do retângulo: ");
        rectangle.h = sc.nextDouble();
        System.out.println("Digite a largura do retângulo: ");
        rectangle.b = sc.nextDouble();

        System.out.printf("Área = %.2f%n", rectangle.area());
        System.out.printf("Perimetro = %.2f%n", rectangle.perimetro());
        System.out.printf("Diagonal = %.2f%n", rectangle.diagonal());

        sc.close();
    }
}
