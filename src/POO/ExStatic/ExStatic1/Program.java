/**
 * Para chamar uma função sem criar um objeto, precisamos, obrigatóriamente, que esses métodos sejam
 * estático, para saber como esse mesmo código funcionário sem o static, olhar no ExStatic2
 */

package POO.ExStatic.ExStatic1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static final double PI = Math.PI;
    //O final nos fala que a variável é uma constante, que com o valor atribuido, nunca pode ser mudada
    //Boa prática: constantes devem ter o nome com letras maiuscúlas. Caso tenha mais de uma palavra, usa-se
    //o _, ex: PRECO_FINAL.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius:");
        double radius = sc.nextDouble();

        double c = cincurference(radius);
        double v = volume(radius);

        System.out.printf("Cincurference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", PI);

        sc.close();
    }

    public static double cincurference(double radius){
        return 2.0 * PI * radius;
    }
    public static double volume(double radius){
        return 4.0 * PI * Math.pow(radius, 3) / 3.0;
        //  4 * pi * r³
        // -------------
        //      3
    }
}
