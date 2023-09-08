package OOP.Interfaces.Ex2;

public class SalariedEmployee extends Employee{
    private float weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, float weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        if(weeklySalary <= 0.0){
            throw new IllegalArgumentException("must be > 0");
        }
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(float weeklySalary){
        if(weeklySalary <= 0.0){
            throw new IllegalArgumentException("must be > 0");
        }
        this.weeklySalary = weeklySalary;
    }

    public float getWEeklySalary(){
        return weeklySalary;
    }

    @Override
    public float getPaymentAmount(){
        return getWEeklySalary();
    }

    @Override
    public String toString(){
        return String.format("salaried employee: %s%n%s: $%,.2f",
        super.toString(), "weekly salary", getWEeklySalary());
    }
}
