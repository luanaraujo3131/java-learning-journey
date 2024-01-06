package Functional.Course.Ex1.Entities;

public class Products {

    private String name;
    private Float price;

    public Products(){}

    public Products(String name, Float price){
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

    public static boolean staticProductPredicate(Products p){
        return p.getPrice() <= 2000f;
    }

    @Override
    public String toString() {
        return "Products [name: " + name + ", price: " + price + "]";
    }
    
}
