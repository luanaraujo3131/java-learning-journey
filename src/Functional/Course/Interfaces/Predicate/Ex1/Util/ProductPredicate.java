package Functional.Course.Interfaces.Predicate.Ex1.Util;

import java.util.function.Predicate;

import Functional.Course.Ex1.Entities.Products;

public class ProductPredicate implements Predicate <Products>{

    @Override
    public boolean test(Products products) {
        return products.getPrice() <= 2000f;
    }
    
}
