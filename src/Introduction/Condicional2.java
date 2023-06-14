package Introduction;

import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double x = input.nextDouble();
        if(x <= 10){
            System.out.println("Unidade");
        } else if (x <= 100) {
            System.out.println("Dezenas");
        } else if (x <= 1000) {
            System.out.println("Centenas");
        } else if (x <= 1000000) {
            System.out.println("Milhares");
        } else {
            System.out.println("Muitos numeros");
        }
    }
}
