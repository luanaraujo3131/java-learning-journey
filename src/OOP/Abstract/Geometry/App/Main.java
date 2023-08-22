package OOP.Abstract.Geometry.App;

import OOP.Abstract.Geometry.Entities.Circle;
import OOP.Abstract.Geometry.Entities.Colors;
import OOP.Abstract.Geometry.Entities.Rectangle;
import OOP.Abstract.Geometry.Entities.Shape;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapeList = new LinkedList<>();

        System.out.println("Number of shapes");
        byte n = sc.nextByte();

        for (byte i = 1; i <= n; i++){
            System.out.println("Shape #" +i+ " data");
            System.out.println("---------------------");
            System.out.print("Rectangle or Circle:");
            String choice = sc.next();
            System.out.print("COLOR (BLACK, BLUE, RED):");
            Colors colors = Colors.valueOf(sc.next());

            if(choice.equalsIgnoreCase("Rectangle")){
                System.out.print("Width:");
                double width = sc.nextDouble();
                System.out.print("Height:");
                double height = sc.nextDouble();

                Shape rec = new Rectangle(colors, width, height);
                shapeList.add(rec);
            } else if (choice.equalsIgnoreCase("Circle")) {
                System.out.print("Radius:");
                double radius = sc.nextDouble();

                shapeList.add(new Circle(colors, radius));
            } else {
                System.out.println("Choice Rectangle or Circle!");
            }
        }

        System.out.println();
        System.out.println("Shape areas: ");
        System.out.println("---------------");
        for(Shape shape : shapeList){
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
