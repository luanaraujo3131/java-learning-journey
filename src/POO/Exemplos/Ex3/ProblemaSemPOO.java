package POO.Exemplos.Ex3;

import javax.swing.*;
import java.util.Locale;

public class ProblemaSemPOO {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double xA, xB, xC, yA, yB, yC;

        //Trinângulo x:
        xA = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure a of triangle X:"));
        xB = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure b of triangle X:"));
        xC = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure c of triangle X:"));
        //Triângulo y:
        yA = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure a of triangle Y:"));
        yB = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure b of triangle Y:"));
        yC = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure c of triangle Y:"));

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        String resulX = String.format("%.2f", areaX);
        String resulY = String.format("%.2f", areaY);

        if(areaX > areaY){
            JOptionPane.showMessageDialog(null, "Medida do triângulo x: " +resulX+ "\n Medida do triângulo y: " +resulY+
                    "\n " +resulX+ " is larger than " +resulY);
        } else {
            JOptionPane.showMessageDialog(null, "Medida do triângulo x: " +resulX+ "\n Medida do triângulo y: " +resulY+
                    "\n " +resulY+ " is larger than " +resulX);
        }

    }
}
