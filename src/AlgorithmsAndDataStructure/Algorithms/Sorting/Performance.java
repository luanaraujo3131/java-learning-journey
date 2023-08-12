//Programa para medir quanto tempo leva para cada algoritmo rodar em segundos

package AlgorithmsAndDataStructure.Algorithms.Sorting;

public class Performance {
    public static void main(String[] args) {
        int[] array = new int[10000]; //quantidade de elementos

        long horarioInicial = System.currentTimeMillis();
        Sorting.selectionSort(array); //algoritmo a ser testado
        //Ordenacao.bubbleSort(array);

        long horarioFinal = System.currentTimeMillis(); //tempo em milisegundos
        long tempoGasto = horarioFinal - horarioInicial;
        System.out.println("Demorou " +tempoGasto/1000.0+" segundos" ); //passando para segundos
    }
}
