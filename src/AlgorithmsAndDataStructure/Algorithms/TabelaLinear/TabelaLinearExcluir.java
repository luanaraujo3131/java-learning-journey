package AlgorithmsAndDataStructure.Algorithms.TabelaLinear;

import java.util.Arrays;

public class TabelaLinearExcluir {
    public static int[]remove(int[] array, int index){
        int[] tempArray = new int[array.length - 1];

        for(int i = 0; i < array.length; i++){
            if(i < index){
                //Copie os dados anteriores a i= index para o final datempArray
                tempArray[i] = array[i];
                if(i > index){
                    //copia matri após i = index para o final de tempArray
                    tempArray[i - 1] = array[i];
                }
            }
        }
        return tempArray;
    }

    public static void main(String[] args) {
        int[] array = {12, 90, 20, 50, 70, 15, 60, 85, 24, 10};
        array = remove(array, 8);
        System.out.println(Arrays.toString(array));
    }
}
