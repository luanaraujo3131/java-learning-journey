/*
* Faça um programa para ler um número inteiro N, depois a altura de N pessoas. Armaene as N
* alturas em um array. Em seguida, mostre a altura média dessas pessoas.*/

package AlgorithmsAndDataStructure.DataStructure.Arrays;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas deseja medir?");
        int n = sc.nextInt();
        double[] alturas = new double[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Digite a altura:");
                alturas[i] = sc.nextDouble();
            }
        double soma = 0.0;
            for (int i = 0; i < n; i++){
                soma += alturas[i];
            }
        double media = soma / n;
        System.out.printf("Altura média: %2f", media);

        sc.close();
    }
}
