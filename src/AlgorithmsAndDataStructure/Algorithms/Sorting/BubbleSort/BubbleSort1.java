package AlgorithmsAndDataStructure.Algorithms.Sorting.BubbleSort;

import java.util.Scanner;

public class BubbleSort1 {
    public static void main(String[] args) {
        int x[] = new int[5];
        int i, n, aux;
        Scanner sc = new Scanner(System.in);
        for(i = 0; i <= 4; i++){
            System.out.println("Digite o " +(i+1)+ "° número: ");
            x[i] = sc.nextInt();
        }
        for(n = 1; n <= 5; n++){
            for(i = 0; i <= 3; i++){
                if(x[i] > x[i + 1]){
                    aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }
        }
        for(i = 0; i <= 4; i++){
            System.out.println((i + 1)+ "° número: " +x[i]);
        }
    }
}
