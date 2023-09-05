package OOP.Interfaces.Geometry;

public class Square implements Shape{
    private double side;

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
