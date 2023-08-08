package AlgorithmsAndDataStructure.Collection.List.ArrayList;

import java.util.Arrays;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        System.out.println("Printin' every element of list");
        System.out.println("-----------------------------");
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 5, 7, 8, 9, 20, 10, 12, 14, 16, 3, 4);
        for (Integer x : listOfNumbers){
            System.out.println(x);
        }
    }
}
