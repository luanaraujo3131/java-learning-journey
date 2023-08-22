package OOP.Polymorphism.Challenge.Entities;

public class OutSourceEmployee extends Employee{

    private Double additionaCharge;

    public OutSourceEmployee() {super();}

    public OutSourceEmployee(String name, Integer hours,
                             Double valuePerHour, Double additionaCharge) {
        super(name, hours, valuePerHour);
        this.additionaCharge = additionaCharge;
    }

    public Double getAdditionaCharge() {
        return additionaCharge;
    }

    public void setAdditionaCharge(Double additionaCharge) {
        this.additionaCharge = additionaCharge;
    }

    @Override
    public Double payment(){
        return super.payment() + additionaCharge * 1.1;
    }
}
