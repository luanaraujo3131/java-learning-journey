package OOP.MetodosRecursivos;

import javax.swing.JOptionPane;
public class FatorialRecursive {
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        double fat = fatorial(numero);
        JOptionPane.showMessageDialog(null, "O fatorial é: "+fat);
    }
    static double fatorial (double num) {
        if(num == 1) { // Caso Base
            return 1;
        }
        double fatorialAnterior = fatorial(num-1);
        double fat = num*fatorialAnterior;
        return fat; // Relação de Recorrência.
    }
}
