package Generics.WildCardAndBoundedTypes.GetPutPrinciple.PutPrinciple;

import java.util.LinkedList;
import java.util.List;

public class Put {
    public static void main(String[] args) {
        List<Object> objectList = new LinkedList<>();
        objectList.add("Luan");
        objectList.add(2);
        objectList.add(5.2);
        objectList.add(2.9f);
        objectList.add('!');

        List<? super Number> myList = new LinkedList<>();
        /*
         *Any type that is a superclass of Number, in this
         case, Objects(Take a look in Info.java), so, in "mylist"
         we can add any type(String, char, int, etc), but we can't
         get(acess) these.
         */

        myList.add(10);
        myList.add(250);

        // Number x = myList.get(0); compiler error
    }
}
