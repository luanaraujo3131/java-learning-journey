package OOP.Exemplos.Ex4.Entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProduct(int quantity){
        this.quantity += quantity;
    }
    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name+ ", price: U$" +String.format("%.2f", price)+ ", quantity in stock: " +quantity+ ", total in stock: U$" +String.format("%.2f",totalValueInStock());
    }
}
