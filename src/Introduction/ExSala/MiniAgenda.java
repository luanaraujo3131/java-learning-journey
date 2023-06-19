/**
 * Recebendo dados para ser agendados, ordenando e fazendo uma busca binária
 */

/**package Introduction.ExSala;

import javax.swing.*;

public class MiniAgenda {
    public static void main(String[] args) {
        Contato[] agenda = new Contato[100];

        String[] opcoes = {"Inserir", "Procurar"};
        int opcao;
        do {
            opcao = JOptionPane.showOptionDialog(null, "Selecione uma opção: ", "Micro agenda",
                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    opcoes, null);
            if (opcao == JOptionPane.YES_OPTION){
                //Inserir
                String nome = JOptionPane.showInputDialog("Nome do contato:");
                String telefone = JOptionPane.showInputDialog("Telefone do contato:");
                String endereco = JOptionPane.showInputDialog("Endereço:");
                Contato contato = new Contato(nome, telefone, endereco);

                int i = quantidade;
                while (i > 0 && agenda[i-1].n)
                agenda[quantidade] = contato;
                quantidade++;
            } else if(opcao == JOptionPane.NO_OPTION){
                //Procurar
                String nome = JOptionPane.showInputDialog("Nome procurado: ");
                Contato contato = busca(agenda, 0, quantidade);
                JOptionPane.showMessageDialog(null, contato);
            }
        }while (opcao != JOptionPane.CLOSED_OPTION);
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
