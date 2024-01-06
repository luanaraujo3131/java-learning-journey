package Generics.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Ex {
    public static void main(String[] args) {
        Map<Product, Float> stock = new HashMap<>();

        Product p1 = new Product("Nintendo Switch", 2000.0f);
        Product p2 = new Product("Playstation 5", 4350.0f);
        Product p3 = new Product("Xbox Series S", 2300.0f);
        Product p4 = new Product("Xbox Series X", 4500.0f);

        stock.put(p1, 1000.0f);
        stock.put(p2, 300000f);
        stock.put(p3, 5000000f);
        stock.put(p4, 50394789f);

        Product productS = new Product("Nintendo Switch", 2000.0f);
        System.out.println("Contains 'productS' key? " +stock.containsKey(productS));
    }
}

class Product{
    private String name;
    private Float price;

    public Product(String name, Float price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
