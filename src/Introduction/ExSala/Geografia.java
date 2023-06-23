package Introduction.ExSala;

import java.text.DecimalFormat;
import javax.swing.*;
public class Geografia {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0#");
        double p0 = Double.parseDouble(JOptionPane.showInputDialog(
                "Qual a população inicial?"));
        double t = Double.parseDouble(JOptionPane.showInputDialog(
                "Qual a taxa de crescimento populacional?"));
        double px = Double.parseDouble(JOptionPane.showInputDialog(
                "Qual a população a que espera-se chegar?"));
        double x = Math.log(px/p0)/Math.log(1+t);
        JOptionPane.showMessageDialog(null, "Levará "+df.format(x)+
                " anos para chegar a esta população.");
    }
}
