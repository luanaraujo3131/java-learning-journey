package AlgorithmsAndDataStructure.Algorithms.Searching.BinarySearch;

import java.util.Random;
import java.util.Scanner;

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        array[0] = r.nextInt(5);
        System.out.println("Array ordenado: ");
        for (int i = 1; i < array.length; i++){
            array[i] = array[i+1] + r.nextInt(5)+1;
            System.out.println(array[i]+ " ");
        }
        System.out.println("Qual número buscado?");
        int numProcurado = sc.nextInt();
        int posicao = Busca(array, numProcurado, 0, array.length);
        if (posicao == -1){
            System.out.println("Valor não encontrado");
        } else {
            System.out.println("Valor se encontra na posição " +posicao);
        }
    }
    public static int Busca(int[] array, int numProcurado, int inicio, int fim){
        if (fim - inicio <= 1){
            return -1; //retornando posição que não é válida
        }
        int meio = (fim - inicio) / 2;
        if(array[meio] == numProcurado){
            return array[meio];
        } else if(array[meio] > numProcurado){
            return Busca(array, numProcurado, meio, fim);
        } else { //array < numProcurado
            return Busca(array, numProcurado, meio, fim);
        }
    }
}
