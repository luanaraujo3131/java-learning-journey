package Functional.Course.Ex1.Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Functional.Course.Ex1.Entities.Products;

public class App {
    public static void main(String[] args) {
        
        List<Products> list = new ArrayList<>();
        
        list.add(new Products("TV", 1500f));
        list.add(new Products("Notebook", 4000f));
        list.add(new Products("Xbox Series X", 4500f));
        list.add(new Products("Playstation 5", 4600f));
    
        /* 
        Comparator<Products> comparator = new Comparator<Products>() {
            @Override
            public int compare(Products p1, Products p2){
                return p1.getName().toUpperCase()
                        .compareTo(p2.getName().toUpperCase());
            }
        };
        Podemos trocar essa função para uma expressão lamba, como a escrita
        abaixo, isso ajuda a diminuir a verbosidade do nosso código.
        */

        Comparator<Products> comparator = (p1, p2) -> {
            return p1.getName().toUpperCase()
                    .compareTo(p2.getName().toUpperCase());
        };

        /* Podemos, ainda, deixa-lá menor tirando o return e os {}
        Comparator<Products> comparator = (p1, p2) -> 
                                    p1.getName().toUpperCase()
                                    .compareTo(p2.getName().toUpperCase());
                                    
        Podemos também passa-lá como paramêtro:
        list.sort((p1, p2) -> p1.getName().toUpperCase()
                                    .compareTo(p2.getName().toUpperCase());
        */

        list.sort(comparator);

        for(Products products : list){
            System.out.println(products);
        }
    }
}
