package AlgorithmsAndDataStructure.Algorithms.Ordenacao;

import java.util.Random;

public class Ordenacao {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[20];
        System.out.println("Array desordenado:");
        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(100);//numbers between 0 and 100
            System.out.print(arr[i]+ " ");
        }
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertSort(arr);
        //mergeSort(arr, 0, arr.length);
        quickSort(arr, 0, arr.length);

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

    public static void insertSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int swap = array[i];
            int j = i;
            while (j > 0 && array[j-1] > swap){
                array[j] = array[j-1];
                j--;
            }
            array[j] = swap;
        }
    }

    public static void mergeSort(int[] array, int inicio, int fim){
        if(fim - inicio == 1){
            return;
        }
        int meio = (inicio + fim) / 2;
        mergeSort(array, inicio, meio);
        mergeSort(array, meio, fim);
        merge(array, inicio, meio, fim);
    }
    public static void merge(int[]array, int inicio, int meio, int fim) {
        while (inicio < meio && meio < fim) {
            if (array[meio] < array[inicio]) {
                int swap = array[meio];
                int i;
                for (i = meio; i > inicio; i--) {
                    array[i] = array[i - 1];
                }
                array[i] = swap;
                meio++;
            }
            inicio++;
        }
    }

    public static void quickSort(int[] array, int inicio, int fim) {
        if(fim-inicio <= 1) {
            return;
        }
        int pivot = particionamento(array, inicio, fim);
        quickSort(array, inicio, pivot);
        quickSort(array, pivot+1, fim);
    }

    public static int particionamento(int[] array, int inicio, int fim) {
        int pivot = inicio+1;
        for(int i = pivot; i < fim; i++) {
            if(array[i] < array[inicio]) {
                int swap = array[i];
                array[i] = array[pivot];
                array[pivot] = swap;
                pivot++;
            }
        }
        pivot--;
        int swap = array[inicio];
        array[inicio] = array[pivot];
        array[pivot] = swap;
        return pivot;
    }

}
