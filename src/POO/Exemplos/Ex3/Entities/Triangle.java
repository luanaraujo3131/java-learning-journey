package POO.Exemplos.Ex3.Entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area(){
        double p = (a + b + c) / 2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p * c));
        return result;
        //return Math.sqrt(p * (p - a) * (p - b) * (p - c));, We could do like this
    }
}
