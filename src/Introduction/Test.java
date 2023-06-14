package Introduction;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        int mult;

        System.out.println("Write a number: ");
        a = input.nextInt();

        for(int x = 1; x <= 10; x++){
            mult = a * x;
            System.out.println(a+ " X " +x+ " = " + mult);
        }

        Scanner input2 = new Scanner(System.in);
        double b;
        double div;

        System.out.println("Write a number:");
        b = input2.nextInt();

        for(int y = 0; y <= 10; y++){
            div = b / y;
            System.out.println(b+ " / " +y+ " = " +div);
        }
    }
}
