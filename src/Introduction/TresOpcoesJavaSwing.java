package Introduction;

import javax.swing.*;

public class TresOpcoesJavaSwing {
    public static void main(String[] args) {
        String opcoes[] = {"Sim", "Não", "Cancelar"};
        int opcao = JOptionPane.showOptionDialog(null, "pergunta",
                "Título", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opcoes, opcoes[0]);
        if(opcao == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Yes");
        } else if (opcao == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "No");
        } else if(opcao == JOptionPane.CANCEL_OPTION){

        }
    }
}
