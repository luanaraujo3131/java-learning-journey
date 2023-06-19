package AlgorithmsAndDataStructure.Algorithms.BinarySearch;

import java.util.Random;
import java.util.Scanner;

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random r = new Random();
        array[0] = r.nextInt(5);
        System.out.print("Array ordenado:\n"+array[0]+" ");
        for(int i = 1; i < array.length; i++) {
            array[i] = array[i-1]+r.nextInt(5)+1;
            System.out.print(array[i]+" ");
        }
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nQual o número procurado?");
        int numProcurado = entrada.nextInt();
        int posicao = busca(array, numProcurado, 0, array.length);
        if(posicao == -1) {
            System.out.println("O valor não foi encontrado.");
        } else {
            System.out.println("O valor se encontra na posição: "+posicao);
        }
    }

    public static int busca(int[] array, int numProcurado, int inicio, int fim) {
        if((fim - inicio) <= 1) {
            return -1;
        }
        int meio = (fim+inicio)/2;
        if(array[meio] == numProcurado) {
            return meio;
        } else if(array[meio] > numProcurado) {
            return busca(array, numProcurado, inicio, meio);
        } else { // if(array[meio] < numProcurado) {
            return busca(array, numProcurado, meio, fim);
        }
    }
}
