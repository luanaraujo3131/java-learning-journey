package Generics.Ex2.WithoutGenerics.Entities;

public class Product implements Comparable<Product>{

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

    public float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [name: " + name + ", price: " + String.format("%.2f", price) + "]";
    }

    @Override
    public int compareTo(Product otherProduct) {
        return price.compareTo(otherProduct.getPrice());
    }
    
}
