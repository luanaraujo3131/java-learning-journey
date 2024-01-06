/*
  The Consumer interface consists of two functions:
  accept() and andThen()
  Java Program to demonstrate
  Consumer's andThen() method
*/
package Functional.Course.Interfaces.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class andThen {
    
    public static void main(String[] args) {

        // Consumer to multiply 2 to every integer of a list
        Consumer <List<Short>> modify = list -> {
            for(short i = 0; i < list.size(); i++){
                list.set(i, (short) (2 * list.get(i)));
            }
        };

        Consumer<List<Short>> 
            displayList = list -> list.stream()
                                    .forEach(a -> System.out.print(a + " "));

        List<Short> list = new ArrayList<>();
        list.add((short)2);
        list.add((short)1);
        list.add((short) 3);

        try{
            // using addThen()
            modify.andThen(displayList).accept(list);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
