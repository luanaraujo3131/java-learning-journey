package OOP.Exercicios.ex1;

public class Rectangle {
    public double b; //base, que é a largura
    public double h; //altura

    public double area(){
        double A = b * h;
        return A;
    }
    public double perimetro(){
        double P = 2 * (b + h);
        return P;
    }
    public double diagonal(){
        double D = Math.sqrt(Math.pow(b, 2) + Math.pow(h, 2));
        return D;
    }
}
