package OOP.Abstract.Geometry.Entities;

public class Circle extends Shape{

    private Double radius;

    public Circle(Colors colors, Double radius) {
        super(colors);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
