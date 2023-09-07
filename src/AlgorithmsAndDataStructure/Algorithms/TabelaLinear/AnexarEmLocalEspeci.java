/*package AlgorithmsAndDataStructure.Algorithms.TabelaLinear;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class AnexarEmLocalEspeci {
    @NotNull
    @Contract(pure = true)
    public static int[]insert(int[] array, int value, int insertIndex){
        int[]tempArray = new int[array.length + 1];
        for(int i = 0; i <= array.length; i++) {
            if (i < insertIndex) {
                tempArray[i] = array[i];
                //copie o valor anterior a i = insertIndex para o tempArray
            } else {
                tempArray[i + 1] = array[i];
                //copie os elementos restantes para tempArray
            }
        }
        tempArray[insertIndex] = value;
        //insere o valor em tempArray
        return tempArray;
    }

    public static void main(String[] args) {
        int[] array = {90, 20, 15, 50, 14, 12, 32};
        array = insert(array, 84, 3);//Insere o 84 em i = 3, ou seja, posição 3
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}*/
