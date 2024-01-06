package Functional.Course.Interfaces.Function.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Functional.Course.Ex1.Entities.Products;
import Functional.Course.Interfaces.Function.util.UpperCaseName;

public class Main {
    
    public static void main(String[] args) {
        List<Products> list = new ArrayList<>();

        list.add(new Products("Tv", 1500f));
        list.add(new Products("Notebook", 4000f));
        list.add(new Products("Xbox Series X", 4500f));
        list.add(new Products("Playstation 5", 4600f));
    
        List<String> listWithToUpperCase = list.stream()
                                            .map(new UpperCaseName())
                                            .collect(Collectors.toList());

        listWithToUpperCase.forEach(System.out::println);                                            

        /**
         * In this code, we are transform a list of Products objects into a list 
         * of strings representing product names in uppercase using a class 
         * called UpperCaseName.
         * "list.stream()"": Transforms the list into a stream, allowing the 
         * application of streaming operations.
         * "map(new UpperCaseName())"": For each Products object in the list,
         * apply the UpperCaseName function to transform the each object 
         * into a string representing the product name in uppercase.
         * The UpperCaseName class implements the Function interface, where 
         * the apply method takes a Products object and returns a string 
         * representing the product name in uppercase.
         * collect(Collectors.toList()): Collects the results in a list of 
         * uppercase strings and stores it in listWithToUpperCase.
         */
    }                                        
}
