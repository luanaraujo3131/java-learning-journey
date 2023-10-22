package Generics.WildCardAndBoundedTypes.Ex2.App;

import java.util.ArrayList;
import java.util.List;

import Generics.WildCardAndBoundedTypes.Ex2.Entities.Circle;
import Generics.WildCardAndBoundedTypes.Ex2.Entities.Rectangle;
import Generics.WildCardAndBoundedTypes.Ex2.Entities.Shape;

//Esse é um programa que retorna a soma das áreas de uma lista de figuras.

public class Main {
    public static void main(String[] args) {
       List<Shape> shape = new ArrayList<>(); 
       shape.add(new Rectangle(3.0, 2.0));
       shape.add(new Circle(2.0));

       List<Circle> listOfCircles = new ArrayList<>();
       listOfCircles.add(new Circle(20));
       listOfCircles.add(new Circle(69));

       /*List<Double> listOfDoubles = new ArrayList<>();
       listOfDoubles.add(1.0);
       listOfDoubles.add(3.0);
       System.out.println(total(listOfDoubles));
       
       * perceba que isso dá erro, pois o Double não implementa a minha interface.
       */
       
       System.out.printf("Total area of list of circles: %.2f", total(listOfCircles));
       System.out.println();
       System.out.printf("Total area: %.2f", total(shape));
       
       /*
        * Como colocamos o List<? extends Shape>, podemos usar o método total para
        * qualquer tipo, e apenas tipos, que implementa a interface Shape, se tentarmos
        * usar o método para algum tipo que não implementa essa interface, como Doblue ou
        * Integer, vai dar erro, assim como se tirarmos o "extends Shape", não podemos
        * usar esse método para os tipos que implementam shape(como retangulo e circle).
        */
    }

    //
    public static double total(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
