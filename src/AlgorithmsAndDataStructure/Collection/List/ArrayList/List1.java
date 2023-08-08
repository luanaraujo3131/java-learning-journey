package AlgorithmsAndDataStructure.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class List1{
    public static void main(String[] args) {
        //List, <generic types> list name = new List type;
        //More about generics and collection framework on readme.md

        List<String> products = new ArrayList<>();

        products.add("Iphone 13"); //adding Strings to list
        products.add("Macbook");
        products.add("Thinkpad");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("CPU I5");
        products.add("Ipad");
        products.add("Iphone 14");
        products.add("Main memory 8GB");
        products.add(4, "Desk");//on position 4, i'll add product "desk"
                                      //Considering that always starts on 0

        System.out.println(products.size());//quantity of elements in list

        for (String x : products) {
            System.out.println(x); //Printing products
        }
        System.out.println("----------------------------");
        //products.remove("CPU I5");
        //products.remove(2); //remove the element 2, in this case, "Thinkpad"

        products.removeIf(x -> x.charAt(0) == 'M'); //Predicate(lambda function)
                        //delete every words that start with "M" letter
        //      x       ->          x.charAt(0)         == "M"
        //(any value) (where)  (inital character of x)  (equals)

        for (String x : products) {
            System.out.println(x);
        }
        System.out.println("----------------------------");
        int searchIndex = products.indexOf("Iphone");//simple: indexOf returns the index of anything(we want)
        System.out.println("Index of Iphone = " +searchIndex);//index = 0
        System.out.println("Index of Thinkpad = " +products.indexOf("Thinkpad"));
        System.out.println("As we don't have this element, it'll return " +products.indexOf("HDMI cable"));//returns -1
        System.out.println();

        System.out.println("Now, I'll return only products that starts with character 'I'");
        System.out.println("------------------------------------------------");
        List<String> onlyProductsWithA = products.stream().filter(x -> x.charAt(0) == 'I').collect(Collectors.toList());
        for (String x : onlyProductsWithA){
            System.out.println(x);
        }
        System.out.println();

        System.out.println("Find the first element that starts with character 'I'");
        System.out.println("---------------------------------------------");
        String firstNameWithI = products.stream().filter(x -> x.charAt(0) == 'I').findFirst().orElse(null);
                                                        //find first element that start with 'I', if there ain't
                                                        //return null
        System.out.println(firstNameWithI);
        String firstNameWithJ = products.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
                                                        //As there is none, it will return null
        System.out.println(firstNameWithJ);
    }
}
