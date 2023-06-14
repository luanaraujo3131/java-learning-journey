package Introduction;

import java.util.Scanner;

public class Repeticao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num1 = sc.nextDouble();
        for( int i = 0; i <= 10; i++) {
            double mult = num1 * i;
            System.out.println(num1+ " * " +i+ " = " +mult);
        }
    }
}
