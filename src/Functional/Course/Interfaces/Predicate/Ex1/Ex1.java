package Functional.Course.Interfaces.Predicate.Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import Functional.Course.Ex1.Entities.Products;
import Functional.Course.Interfaces.Predicate.Ex1.Util.ProductPredicate;

public class Ex1 {

    public static void main(String[] args) {   
        List<Products> list = new ArrayList<>();
        
        list.add(new Products("TV", 1500f));
        list.add(new Products("Notebook", 4000f));
        list.add(new Products("Xbox Series X", 4500f));
        list.add(new Products("Playstation 5", 4600f));
    
        Predicate<Products> predicate = p -> p.getPrice() <= 2000f;
        list.removeIf(predicate);
        list.forEach(p -> System.out.println(p));

        //Other ways to do this with lambdas:
        /**
        Inline:
        list.removeIf(p -> p.getPrice() <= 2000f);
    
        Interface reference:
        list.removeIf(new ProductPredicate()); 
        
        Method reference:
                    Class  :: method we wanna refer
        list.removeIf(Products::staticProductPredicate); this is on Product class: Functional.Course.Ex1.Entities.Products;

        
         * Tow lambdas expressions. RemoveIf() removes elements
         * acconding one condition(in this case, if price <= 2000). 
         * And forEach() is just printig all the values. I could do
         * the same with a forEach loop:
         * for(p : list){
         *      System.out.println(p);
         * }
        
        */


    }
}
