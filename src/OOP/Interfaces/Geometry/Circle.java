package OOP.Interfaces.Geometry;

public class Circle implements Shape{
    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * raio;
    }

}
