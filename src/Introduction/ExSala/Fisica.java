package Introduction.ExSala;

import javax.swing.*;
public class Fisica {
    public static void main(String[] args) {
        double v0 = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite a velocidade de lançamento."));
        double a = Double.parseDouble(JOptionPane.showInputDialog(
                "Digite o ângulo de lançamento em graus."));
        double t = Math.toRadians(a);
        double g = 10;
        double d = v0*v0*Math.sin(2*t)/g;
//        double d = Math.pow(v0, 2)*Math.sin(2*t)/g;
//        double h = v0*v0*Math.sin(t)*Math.sin(t)/(2*g);
        double h = Math.pow(v0,2)*Math.pow(Math.sin(t),2)/(2*g);
        JOptionPane.showMessageDialog(null, "A distância máxima é de :"+d+
                "\nA altura máxima é de :"+h);
    }
}
