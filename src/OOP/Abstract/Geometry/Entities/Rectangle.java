package OOP.Abstract.Geometry.Entities;

public class Rectangle extends Shape{

    private Double width;
    private Double heigth;

    public Rectangle(){}

    public Rectangle(Colors colors, Double width, Double heigth) {
        super(colors);
        this.width = width;
        this.heigth = heigth;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeigth() {
        return heigth;
    }

    public void setHeigth(Double heigth) {
        this.heigth = heigth;
    }

    @Override
    public Double area() {
        return width * heigth;
    }
}
