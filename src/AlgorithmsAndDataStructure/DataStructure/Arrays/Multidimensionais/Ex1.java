package AlgorithmsAndDataStructure.DataStructure.Arrays.Multidimensionais;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas linhas tem a matriz");
        int m = sc.nextInt();
        System.out.println("Quantas colunas tem a matriz");
        int n = sc.nextInt();

        int[][] matrizA = new int[m][n];
        int[][] matrizB = new int[m][n];

        //inputA
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.println("Digite o próximo item da matriz A:");
                matrizA[i][j] = sc.nextInt();
            }
        }
        //inputB
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.println("Digite o próximo item da matriz B:");
                matrizB[i][j] = sc.nextInt();
            }
        }
        //outputA
        System.out.println("Matriz A:");
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrizA[i][j]+"\t");
            }
            System.out.println();
        }
        //outputB
        System.out.println("Matriz B:");
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrizB[i][j]+"\t");
            }
            System.out.println();
        }
        //outputSOMA
        int matrizSoma[][] = new int[m][n];
        System.out.println("Soma:");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.print(matrizSoma[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
