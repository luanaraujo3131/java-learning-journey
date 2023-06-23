package POO.MetodosRecursivos;

import java.text.DecimalFormat;
import javax.swing.*;
public class JurosComposto {
    public static void main(String[] args) {
        double montanteInicial = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor aplicado?"));
        double taxa = Double.parseDouble(JOptionPane.showInputDialog("Qual a taxa de juros?"));
        double meses = Double.parseDouble(JOptionPane.showInputDialog("Quantos meses ficou aplicado?"));
        double montanteFinal = juros(montanteInicial, taxa, meses);
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        JOptionPane.showMessageDialog(null, "Ao final, haverá "+df.format(montanteFinal)+" na conta.");
    }
    static double juros(double montanteInicial, double taxa, double meses){
        // Caso base
        if(meses == 0) {
            return montanteInicial;
        }
        // Relação de Recorrência
        double montanteMesAnterior = juros(montanteInicial, taxa, meses - 1);
        double montanteFinal = montanteMesAnterior*(1+taxa);
        return montanteFinal;
    }
}
