package Introduction.ExSala;

import java.text.DecimalFormat;
import javax.swing.*;
public class Quimica {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0#");
        double q0 = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite a quantidade inicial da substância:"));
        double r = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite a taxa de desintegração da substância:"));
        double t = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o tempo decorrido:"));
//        double q = q0 * Math.pow(Math.E, -r*t);
        double q = q0 * Math.exp(-r*t);
        JOptionPane.showMessageDialog(null, "Sobraram "+df.format(q)+
                " gramas de substância.");
    }
}
