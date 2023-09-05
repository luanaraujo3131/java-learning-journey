package OOP.Interfaces.Geometry;

public class Triangle implements Shape{
    private double base;
    private double heigth;
    private double side1, side2, side3;

    public void setBaseAndHeigth(double base, double heigth){
        this.base = base;
        this.heigth = heigth;
    }

    public void setSides(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        return base * heigth / 2;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
