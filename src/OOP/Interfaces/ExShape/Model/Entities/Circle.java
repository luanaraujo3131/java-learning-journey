package OOP.Interfaces.ExShape.Model.Entities;

import OOP.Abstract.Geometry.Entities.Colors;

public class Circle extends AbstractShape{
    private float raio;

    public Circle(Colors color, float raio) {
        super(color);
        this.raio = raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public Float Area(){
        return (float) (Math.PI * Math.pow(raio, 2));
    }

    @Override
    public Float Perimetro() {
        return (float) (2 * Math.PI * raio);
    } 
}
