/**package AlgorithmsAndDataStructure.Algorithms.SortingAndSearching.BinarySearch;

import java.util.Scanner;

public class BinarySearch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contato[] agenda = new Contato[10];
        agenda[0] = new Contato("Luan", "0000-0000", "Brasil");
        agenda[1] = new Contato("Yasmin", "1111-1111", "Portugal");
        agenda[2] = new Contato("Jasmin", "2222-2222", "Suiça");
        agenda[3] = new Contato("Jhon", "3333-3333", "Alemanha");
        agenda[4] = new Contato("Lilian", "4444-4444", "França");
        agenda[5] = new Contato("Karen", "5555-5555", "USA");
        agenda[6] = new Contato("Bruce", "6666-6666", "Canadá");
        agenda[7] = new Contato("Jude", "7777-7777", "Inglaterra");
        agenda[8] = new Contato("Senku", "8888-8888", "Japão");
        agenda[9] = new Contato("Beth", "9999-9999", "Grécia");

        System.out.println("Qual nome procurado?");
        String nomeProcurado = sc.next();
        System.out.println(contato);
    }
}

class Contato{
    String name;
    String number;
    String address;

    //construtor
    public Contato(String n, String num, String ad){
        name = n;
        number = num;
        address = ad;
    }
    public String toString(){
        return "Name: " +name+ "\nPhone number: " +number+ "\nAddress: " +address;
    }
}*/