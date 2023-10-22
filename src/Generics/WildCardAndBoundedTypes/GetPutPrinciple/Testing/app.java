package Generics.WildCardAndBoundedTypes.GetPutPrinciple.Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 */

public class app {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 5, 7, 8, 9, 10);
        List<Float> floatList = Arrays.asList(1.5f, 3.6f, 7.6f);
        List<Object> objList = new ArrayList<Object>();

        copy(intList, objList);//copy the list of int
        printList(objList);
        copy(floatList, objList);//copy the list of float adding the previous int list
        printList(objList);
        //Result = 1,2,3,4,5,6,7,8,9,10,1.5,3.6,7.6
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list){
        for(Object obj : list){
            System.out.print(obj+ " ");
        }
        System.out.println();
    }
}
