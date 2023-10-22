package Generics.WildCardAndBoundedTypes.Ex1;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Short> listOfShorts = new ArrayList<>();
        System.out.println("List of Shorts");
        listOfShorts.add((short) 1);
        listOfShorts.add((short) 2);
        listOfShorts.add((short) 3);
        listOfShorts.add((short) 4);
        printList(listOfShorts);
        
        List<String> listOfStrings = new ArrayList<>();
        System.out.println("List of Strings");
        listOfStrings.add("Batman");
        listOfStrings.add("Bilbo Baggins");
        listOfStrings.add("Frodo");
        printList(listOfStrings);
        
        List<Character> listOfChars = new ArrayList<>();
        System.out.println("List of characteres:");
        listOfChars.add('a');
        listOfChars.add('b');
        listOfChars.add('n');
        listOfChars.add('!');
        printList(listOfChars);

        List<Integer> listOfIntegers = Arrays.asList(980, 50, 800, 450, 622, 365);
        System.out.println("List of Integer:");
        printList(listOfIntegers);        
    }

    /**
     * @param list
     * This <?> means that this method can accept a list of any
     * type. If we want to use this method to print a List of
     * String, Integer, Float, Object, etc., we can do so.
     */
    public static void printList(List<?> list){
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
