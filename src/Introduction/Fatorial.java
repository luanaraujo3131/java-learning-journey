package Introduction;

import javax.swing.*;

public class Fatorial {
    public static void main(String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial:"));
        int fator = 1;
        for(int i = num; i > 1; i--){
            fator *= i;
        }
        JOptionPane.showMessageDialog(null, "Fatorial: " +fator);
    }
}
