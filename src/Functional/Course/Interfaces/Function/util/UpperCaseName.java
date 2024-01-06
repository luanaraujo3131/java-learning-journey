package Functional.Course.Interfaces.Function.util;

import java.util.function.*;

import Functional.Course.Ex1.Entities.Products;


/**
 * T = entry type
 * R = Response type
 * public interface Function<T, R>{
 *     R apply T t
 * }
 */

                                             //entry     exit   
public class UpperCaseName implements Function<Products, String>{

    @Override
    public String apply(Products products) {
        return products.getName().toUpperCase();
    }
    
}
