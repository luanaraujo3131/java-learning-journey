/**write a program in which a secret random number is chosen between 0 and 100. Then,
 * ask the user for their guess. If the user guesses correctly, congratulate them and inform
 * them of how many attempts it took. If the user guesses incorrectly, the program should
 * indicate whether the secret number is higher or lower than the guessed number and allow
 * for a new attempt.
*/

package Introduction.ExSala;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);

        int secretNumber = ran.nextInt(100);
        int count = 0;
        int choice;
        do {
            System.out.println("Choice one number: ");
            choice = sc.nextInt();
            count++;
            if (choice == secretNumber){
                System.out.println("Congratulate! You won on " +count+ "º attempt");
            } else if (choice != secretNumber){
                if (choice < secretNumber){
                    System.out.println("Secret number is bigger than your try.");
                } else {
                    System.out.println("Secret number is less than your try.");
                }
            } else {
                System.out.println("Write a number between 0 and 100");
            }
        } while (choice != secretNumber);

        sc.close();
    }

}
