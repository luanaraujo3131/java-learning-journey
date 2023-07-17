package Introduction;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a number: ");
        int number = sc.nextInt();

        System.out.println(number <= 50 ? number+ " Is less than 50" : number+ " Is bigger than 50");
        //Isso substitui o if-else
        //Esse código é o mesmo que
        /**
         * if(number <= 50){
         *    System.out.println(number+ " Is less than 50);
         * } else{
         *    System.out.printl(number+ " Is bigger than 50);
         * }
         */

        System.out.println(1 == 1 ? "True expression" : "false expression");

        //Com if-else:
        /**
         * if(1 == 1){
         *    System.out.println("True expression");
         * } else{
         *    System.out.println("False expression");
         * }
         */
    }
}
