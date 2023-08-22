package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        tryMethod();

        System.out.println("Continue...");
    }
    public static void tryMethod(){
        Scanner sc = new Scanner(System.in);

        try {
            String[] arr = sc.nextLine().split(" ");
            System.out.println("Posição?");
            byte position = sc.nextByte();
            System.out.println(arr[position]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
            e.printStackTrace();
        } catch (InputMismatchException e){
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
