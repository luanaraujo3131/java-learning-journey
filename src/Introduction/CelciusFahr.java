package Introduction;

import java.util.Scanner;

public class CelciusFahr {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celcius:");
        double c = input.nextDouble();
        double f = 9 * c / 5 + 32;
        System.out.println(c+ " em Celcius é " +f+ " Fahrenheit");
        //Se der problema ao compilar numero com com ponto(3.4, etc.), tente
        //com vigula(3,4)
    }
}
