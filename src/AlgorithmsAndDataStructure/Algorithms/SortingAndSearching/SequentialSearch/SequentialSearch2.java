package AlgorithmsAndDataStructure.Algorithms.SortingAndSearching.SequentialSearch;

import javax.swing.*;

public class SequentialSearch2 {
    public static void main(String[] args) {
        Contato[] agenda = new Contato[10];
        agenda[0] = new Contato("Batman", "0000-0000", "Brasil");
        agenda[1] = new Contato("Robin", "1111-1111", "Portugal");
        agenda[2] = new Contato("Pantera Negra", "2222-2222", "Suiça");
        agenda[3] = new Contato("Senku", "3333-3333", "Alemanha");
        agenda[4] = new Contato("Arqueiro Verde", "4444-4444", "França");
        agenda[5] = new Contato("Barbára Gordon", "5555-5555", "USA");
        agenda[6] = new Contato("Besouro Azul", "6666-6666", "Canadá");
        agenda[7] = new Contato("Wonder Woman", "7777-7777", "Inglaterra");
        agenda[8] = new Contato("Peter Parker", "8888-8888", "Japão");
        agenda[9] = new Contato("Super-man", "9999-9999", "Grécia");

        String name = JOptionPane.showInputDialog("Qual nome do contato procurado?");
        int count = 0;
        for(int i = 0; i < agenda.length; i++){
            if(agenda[i].name.contains(name.subSequence(0, name.length()))){
                JOptionPane.showMessageDialog(null, agenda[i]);
                count++;
            }
        }
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
}
