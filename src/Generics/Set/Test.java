package Generics.Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> listLinkedHashSet = new LinkedHashSet<>();
        Set<String> listTreeSet = new TreeSet<>();
        
        listLinkedHashSet.add("Vermelho");
        listLinkedHashSet.add("Linha");
        listLinkedHashSet.add("Amarelo");
        listLinkedHashSet.add("Bom");
        listLinkedHashSet.add("Dia");
        listLinkedHashSet.add("Tarde");
        listLinkedHashSet.add("Noite");
        listLinkedHashSet.add("Felicidade");
        listLinkedHashSet.add("Confusão");
        listLinkedHashSet.add("Solidão");
        listLinkedHashSet.add("Confissão");

        System.out.println("Lista na ordem que os elementos foram inseridos(LinkedHashSet): ");
        for (String string : listLinkedHashSet) {
            System.out.println(string);
        }

        System.out.println();

        listTreeSet.add("Vermelho");
        listTreeSet.add("Linha");
        listTreeSet.add("Amarelo");
        listTreeSet.add("Bom");
        listTreeSet.add("Dia");
        listTreeSet.add("Tarde");
        listTreeSet.add("Noite");
        listTreeSet.add("Felicidade");
        listTreeSet.add("Confusão");
        listTreeSet.add("Solidão");
        listTreeSet.add("Confissão");

        System.out.println("Lista ordenada(TreeSet):");
        for (String string : listTreeSet) {
            System.out.println(string);
        }
    }
}