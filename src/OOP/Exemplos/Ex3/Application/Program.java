package OOP.Exemplos.Ex3.Application;

import javax.swing.*;
import java.util.Locale;
import OOP.Exemplos.Ex3.Entities.Triangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        //Triângulo x:
        x.a = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure a of triangle X:"));
        x.b = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure b of triangle X:"));
        x.c = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure c of triangle X:"));
        //Triângulo y:
        y.a = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure a of triangle Y:"));
        y.b = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure b of triangle Y:"));
        y.c = Double.parseDouble(JOptionPane.showInputDialog("Enter the measure c of triangle Y:"));

        double areaX = x.area();
        double areaY = y.area();

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