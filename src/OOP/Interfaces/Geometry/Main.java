package OOP.Interfaces.Geometry;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Square square = new Square();

        triangle.setSides(3.0, 4.0, 5.0);
        triangle.setBaseAndHeigth(6, 8);
        circle.setRaio(8);
        square.setSide(10);

        double triangleArea = triangle.area();
        double trianglePerimeter = triangle.perimeter();
        double circleArea = circle.area();
        double circlePerimeter = circle.perimeter();
        double squareArea = square.area();
        double squarePerimeter = square.perimeter();

        System.out.println("Triangle area: " +triangleArea);
        System.out.println("Triangle perimeter: " +trianglePerimeter);
        System.out.printf("Circle area: %.2f%n", circleArea);
        System.out.printf("Circle perimeter: %.2f%n", circlePerimeter);
        System.out.println("Square area: " +squareArea);
        System.out.println("Square perimeter: " +squarePerimeter);
    }
}
