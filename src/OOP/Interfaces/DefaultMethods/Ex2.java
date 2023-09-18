package OOP.Interfaces.DefaultMethods;

import java.util.LinkedList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            strings.add(String.valueOf(i));
        }
        //Lambda
        strings.forEach((string -> {
            System.out.println("Value: " +string);
        }));
    }
}
