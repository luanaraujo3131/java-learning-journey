//TREESET ORDENA OS ELEMENTOS

package Generics.Set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class treeSet {

    public static void main(String[] args) {
        Set<Integer> list1 = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 8, 12, 14, 16, 23, 35, 37, 98, 102, 145, 137));
        Set<Integer> list2 = new TreeSet<>(Arrays.asList(5, 6, 82, 14, 15, 16, 23, 170, 353, 450, 8));

        for (Integer elements : list1) {
            System.out.print(elements + " ");
        }
        System.out.println();
        for(Integer elements : list2){
            System.out.print(elements + " ");
        }
        System.out.println();

        //União
        Set<Integer> list3 = new TreeSet<>(list1);//Recebe os valores da lista 1
        list3.addAll(list2);//Adiciona os valores da lista 2 QUE NÃO estão na lista 1
        System.out.println(list3);

        //Intersercção
        Set<Integer> list4 = new TreeSet<>(list1);
        list4.retainAll(list2);//Elementos que estão tanto na list1 como na list2
        System.out.println(list4);
        
        //Diferença
        Set<Integer> list5 = new TreeSet<>(list1);
        list5.removeAll(list2);//Remove os elementos que são iguais nas duas listas
        System.out.println(list5);
    }
}
