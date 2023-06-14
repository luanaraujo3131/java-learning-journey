package AlgorithmsAndDataStructure.Algorithms.TabelaLinear;

public class AnexarTabelaLinear {
    public static int[]add(int[] array, int value) {
        int[] tempArray = new int[array.length + 1];//tempArray > array original

        for (int i = 0; i < array.length; i++){
            //copia o valor da matriz para tempArray
            tempArray[i] = array[i];
        }
        tempArray[array.length] = value;//Insera o valor para o último índice
        return tempArray;
    }

    public static void main(String[] args) {
        int[] array = {90, 20, 15, 50, 14, 12, 32};
        array = add(array, 75);
        for(int i = 0; i <= array.length; i++){
            System.out.println(array[i]);
        }
    }
}
