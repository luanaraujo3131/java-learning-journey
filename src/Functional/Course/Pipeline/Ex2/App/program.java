package Functional.Course.Pipeline.Ex2.App;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Functional.Course.Pipeline.Ex2.Entities.Products;

public class program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String path = "ExInputForStreamTest.txt";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            List<Products> listOfProducts = new ArrayList<>();

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(", ");
                listOfProducts.add(new Products(fields[0], Float.parseFloat(fields[1])));
                line = bufferedReader.readLine();
            }

            Float average = (float) listOfProducts.stream()
                                .mapToDouble(Products::price)
                                .average()
                                .orElse(0.0);
            System.out.printf("average = %.2f%n", average);

            Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            //all products with price < average
            List<String> namesOfProducts = listOfProducts.stream()
                                    .filter(p -> p.price() <= average)
                                    .map(p -> p.name()) //generate a new list with the result given above
                                    .sorted(comparator.reversed())//Sorts strings according to comparator() and reversed() sorts in descending order
                                    .collect(Collectors.toList());
            namesOfProducts.forEach(System.out::println);                  
        } catch (IOException e) {
            System.out.println("error: " +e.getMessage());
        }
    }
}
