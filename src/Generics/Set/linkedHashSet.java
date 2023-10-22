//ELEMENTOS NA ORDEM EM QUE SÃO INSERIDOS

package Generics.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSet {
    public static void main(String[] args) {
        Set<String> list1 = new LinkedHashSet<>();
        list1.add("Vermelho");
        list1.add("Linha");
        list1.add("Amarelo");
        list1.add("Bom");
        list1.add("Dia");
        list1.add("Tarde");
        list1.add("Noite");
        list1.add("Felicidade");
        list1.add("Confusão");
        list1.add("Solidão");
        list1.add("Confissão");

        for (String stringList : list1) {
            System.out.println(stringList);
        }
    }
}
