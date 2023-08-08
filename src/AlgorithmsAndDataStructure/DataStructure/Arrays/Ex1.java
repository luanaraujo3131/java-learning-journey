/*
* Faça um programa que leia um número N (máximo = 10) e depois N números e os armaene num vetor.
* Em seguida, mostre os números negativos
* */

package AlgorithmsAndDataStructure.DataStructure.Arrays;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n;
        System.out.println("Digite a quantidade números a serem guardados:");
        while (true){
            while (!scanner.hasNextByte()){
                System.out.println("Digite um número em 1 e 10:");
                scanner.next();
            }
            n = scanner.nextByte();
            if(n > 0 && n <= 10){
                break;
            } else {
                System.out.println("Digite um número entre 1 e 10:");
            }
        }
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Digite o número " +(i+1));
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                System.out.println(" " + arr[i]);
            }
        }

        scanner.close();
    }
}
