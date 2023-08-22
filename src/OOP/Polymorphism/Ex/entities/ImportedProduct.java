package OOP.Polymorphism.Ex.entities;

public class ImportedProduct extends Product{
    private Double customersFee;

    public ImportedProduct(){}

    public ImportedProduct(String name, Double price, Double customersFee) {
        super(name, price);
        this.customersFee = customersFee;
    }

    public Double getCustomersFee() {
        return customersFee;
    }

    public void setCustomersFee(Double customersFee) {
        this.customersFee = customersFee;
    }

    @Override
    public String priceTag(){
        return super.priceTag() + ", Costumer Fee: " + customersFee + " - TOTAL VALUE: " +totalPrice();
    }

    public Double totalPrice(){
        return price += customersFee;
    }
}
