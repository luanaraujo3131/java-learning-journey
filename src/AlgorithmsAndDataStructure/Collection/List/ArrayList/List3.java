package AlgorithmsAndDataStructure.Collection.List.ArrayList;

import java.util.Arrays;
import java.util.List;

public class List3 {
    public static void main(String[] args) {
        System.out.println("Printing even numbers:");
        System.out.println("----------------------");
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 65, 7, 8, 100, 10, 120, 122, 22, 24, 26, 38, 40);
        list3.forEach(x -> {
            if (x % 2 ==0){
                System.out.println(x);
            }
        });
    }
}
