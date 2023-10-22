//HASHSET NÃO ORDENA
package Generics.Set;

import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Set<String> setTest = new HashSet<>();
    
        setTest.add("Tv");
        setTest.add("Monitor");
        setTest.add("Smartwatch");
        setTest.add("Notebook");
        setTest.add("Mouse");
        setTest.add("Keyboard");
        setTest.add("UCP");
        setTest.add("Lg ergo");

        System.out.println(setTest.contains("Notebook"));//true
        System.out.println(setTest.contains("Table"));//false

        for (String elements : setTest) {
            System.out.println(elements);
        }

        setTest.remove("Mouse");
        setTest.removeIf(x -> x.length() <= 3);//predicado.
        //Nesse removeIf estamos removendo os elementos que tem 3 ou menos caractere(tv e ucp)
        setTest.removeIf(x -> x.charAt(0) == 'L');//remove elemento que inicia com a letra L

        System.out.println();
        System.out.println("Após alterações");
        System.out.println("------------------");

        for(String elements : setTest){
            System.out.println(elements);
        }
    }
}
