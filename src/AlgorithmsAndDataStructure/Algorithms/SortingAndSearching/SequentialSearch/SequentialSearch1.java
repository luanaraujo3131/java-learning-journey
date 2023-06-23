package AlgorithmsAndDataStructure.Algorithms.SortingAndSearching.SequentialSearch;

import java.util.Random;
import java.util.Scanner;

public class SequentialSearch1 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner entrada = new Scanner(System.in);
        int[] lista = new int[20];
        System.out.println("Valores no array: ");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = r.nextInt(100);
            System.out.print(lista[i]+" ");
        }
        System.out.println("\nQual valor você deseja procurar?");
        int numProcurado = entrada.nextInt();
        int contador = 0;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i] == numProcurado) {
                System.out.println("O valor foi encontrado na posição: "+i);
                contador++;
            }
        }
        if(contador > 0) {
            System.out.println("Foram encontrados "+contador+" ocorrências do valor.");
        } else {
            System.out.println("Não houve ocorrência do valor.");
        }
    }
}
