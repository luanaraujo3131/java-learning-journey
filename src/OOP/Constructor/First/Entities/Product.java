package OOP.Constructor.First.Entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    //CONSTRUTOR A SER EXECUTADO NO MOMENTO DA INSTANCIAÇÃO DO OBJETO
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //Na prática, quando criamos um construtor, obrigamos que os atributos(variáveis...) tenham valores
    //portanto, devemos criar o objeto, após a leitura dos valores, garantindo, assim, que as variáveis
    //sejam ao menos inicialiadas.

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
