package Introduction;

import javax.swing.*;

public class RepeticaoJOption {
    public static void main(String[] args){
        String[] opcoes = {"Cumprimento", "Elogio", "Despedida"};
        int opcao;
        do {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção",
                    "menu", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, opcoes, null);
            if(opcao == JOptionPane.YES_NO_OPTION){
                JOptionPane.showMessageDialog(null, "Olá!");
            } else if (opcao == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Você está ótimo!");
            } else if (opcao == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null,  "Adeus!");
            }
        } while (opcao != JOptionPane.CLOSED_OPTION);
    }
}
