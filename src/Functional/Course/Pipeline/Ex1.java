package Functional.Course.Pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 15, 10, 20);
        
        Stream<Integer> stream = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(stream.toArray()));

        //sum all elements. Where 0 = neutral element(any x + 0 = x)
        //if we were multiplying all number, the neutral element 
        //would be 1(x * 1 = x)
        var sum = list.stream().reduce(0, (x, y) -> x + y); 
        System.out.println("Sum = " + sum);

        List<Integer> newList = list.stream()
                            .filter(x -> x % 2 == 0)
                            .map(x -> x * 100)
                            .collect(Collectors.toList());
        System.out.println(Arrays.toString(newList.toArray()));
    }    
}
