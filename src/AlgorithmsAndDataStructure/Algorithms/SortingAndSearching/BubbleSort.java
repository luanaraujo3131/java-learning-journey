package AlgorithmsAndDataStructure.Algorithms.SortingAndSearching;

import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args) {
        int X[] = new int[5];
        int n, i, aux;
        Scanner sc = new Scanner(System.in);
        //carrengando os número no vetor:
        for(i = 0; i <= 4; i++){
            System.out.println("Digite o " +(i+1)+ " número: ");
            X[i] = sc.nextInt();
        }
        //Ordenando de forma crescente
        //Laço com a quantidade de elementos do vetor
        for(n = 1; n <= 5; n++){
            //laço que percorre da primeira à penultima posiçao do vetor
            for(i = 0; i <= 3; i++){
                if (X[i] > X[i+1]) {
                    aux = X[i];
                    X[i] = X[i+1];
                    X[i+1] = aux;
                }
            }
        }
        //Mostrando o vetor ordenado:
        for(i = 0; i <= 4; i++){
            System.out.println((i+1+ " número: " +X[1]));
        }
    }
}
