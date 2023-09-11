package OOP.Interfaces.ExShape.Model.Entities;

import OOP.Abstract.Geometry.Entities.Colors;

public class Rectangle extends AbstractShape{

    private Float width;
    private Float height;

    public Rectangle(Colors color, Float width, Float height){
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle() {}

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public Float Area() {
        if(width < 0 || height < 0){
            throw new IllegalArgumentException("Escolha números positivos!");
        }
        return width * height;
    }

    @Override
    public Float Perimetro() {
        if(width < 0 || height < 0){
            throw new IllegalArgumentException("Escolha números positivos!");
        }
        return 2 * (width + height);
    }
}
