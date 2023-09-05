package OOP.Interfaces.ProblemEx.Part1.Model.Entities;

public class Invoice {
    private double basePayment;
    private double tax;

    public Invoice(){
    }

    public Invoice(double basePayment, double tax){
        this.basePayment = basePayment;
        this.tax = tax;
    }

    public double getBasePayment() {
        return basePayment;
    }

    public void setBasePayment(double basePayment) {
        this.basePayment = basePayment;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Double getTotalPayment(){
        return getBasePayment() + getTax();
    }
}
