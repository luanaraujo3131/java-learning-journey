package AlgorithmsAndDataStructure.DataStructure.Arrays;

import javax.swing.*;

public class ex1Sala {
    public static void main(String[] args) {
        int[] conjuntos = new int[5];
        //Recebendo valores:
        for(int i = 0; i <= conjuntos.length; i++){
            conjuntos[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o próximo número:"));
        }
        JOptionPane.showMessageDialog(null, "Valores encontrados no array: ");
        for(int i = 0; i <= conjuntos.length; i++){
            JOptionPane.showMessageDialog(null, conjuntos[i] + ", ");
        }
    }
}
