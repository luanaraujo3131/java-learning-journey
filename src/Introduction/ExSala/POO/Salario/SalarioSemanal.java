package Introduction.ExSala.POO.Salario;

import javax.swing.*;
import java.text.DecimalFormat;

public class SalarioSemanal {
    public static void main(String[] args) {
        double horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("O funcionário trabalhou quantas horas?"));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor da hora:"));
        double salarioSemanal = 0;
        if(horasTrabalhadas <= 40){
            salarioSemanal = horasTrabalhadas * valorHora;
        } else if (horasTrabalhadas > 40) {
            salarioSemanal = 40 * valorHora + (horasTrabalhadas - 40) * valorHora * 2;
        }
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        JOptionPane.showMessageDialog(null, "funcionário receberá\n" +df.format(salarioSemanal));
    }
}
