package Generics.WildCardAndBoundedTypes.GetPutPrinciple.GetPrinciple;

import java.util.LinkedList;
import java.util.List;

public class Get {
    public static void main(String[] args) {
        List<Integer> intList = new LinkedList<>();
        intList.add(15);
        intList.add(150);
        intList.add(690);

        /*
         * Any type extends for object Number
         * (Take a look in Info.java, in this package)
         */
        List<? extends Number> listNumbers = intList;
        //listNumbers.add(5); //Compiler error
        listNumbers.get(0);
        //we can get an element, but we can't add
    }
}
