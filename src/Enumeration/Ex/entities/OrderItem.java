package Enumeration.Ex.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    //Association
    private Product products;

    public OrderItem(){}

    public OrderItem(Integer quantity, Double price, Product products){
        super();
        this.quantity = quantity;
        this.price = price;
        this.products = products;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public double subTotal(/*Integer quantity, double price*/){
        return price * quantity;
    }

    @Override
    public String toString() {
        return getProducts().getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
