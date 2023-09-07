package AlgorithmsAndDataStructure.Algorithms.Sorting;

import java.util.Random;

public class Sorting {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[20];
        System.out.println("Array desordenado:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        //bubbleSort(arr);
        // selectionSort(arr);
        insertSort(arr);

        System.out.println("\nArray ordenado:");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void bubbleSort(int[] arr){
        for(int j = arr.length-1; j > 0; j--){
            for (int i = 0; i < j; i++){
                if(arr[i] > arr[i+1]){
                    int swap = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = swap;
                }
            }
        }
        /**
         * Outra forma de verifica com o loop:
         * boolean ordenado;
         * do{
         *   ordenado = true;
         *
         *   bloco de código para verificar se a lista está ou não ordenada
         *
         * } while(!ordenado) //false
         */
    }
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int indiceDoMenor = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[indiceDoMenor]){
                    indiceDoMenor = j;
                }
            }
            int swap = arr[i];
            arr[i] = arr[indiceDoMenor];
            arr[indiceDoMenor] = swap;
        }
    }
    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int swap = arr[i];
            int j = i;
            while (j > 0 && arr[j-1] > swap){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = swap;
        }
    }
}
