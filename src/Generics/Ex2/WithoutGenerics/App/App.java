package Generics.Ex2.WithoutGenerics.App;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Generics.Ex2.WithoutGenerics.Entities.Product;
import Generics.Ex2.WithoutGenerics.Service.CalculationService;

public class App {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        String path = "genericText.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String eachLine = bufferedReader.readLine();
            while(eachLine != null){
                String[] fields = eachLine.split(", ");
                list.add(new Product(fields[0], Float.parseFloat(fields[1])));
                eachLine = bufferedReader.readLine();
            }
            for (Product i : list) {
                System.out.println(i);
            }
            Product x = CalculationService.max(list);
            System.out.println("Max: " +x);
        } catch(IOException e){
            System.out.println("Erro: " +e.getMessage());
        }
    }
}
