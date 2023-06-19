/**
 * Escreva um programa que permita que o RH de uma empresa calcular o salário semanal que deverá
 * pagar a um funcionário. O programa deve receber do usuário a quantidade de horas trabalhadas
 * e o valor da hora, então calcular o salário semanal pela multiplicação da quantidade de horas pelo
 * valor da hora. Se o funcionário trabalhar mais de 40 hpras na semana terá direito a hora-extra, isto é,
 * o que execeder às 40 horas será paga em dobro.
 */

package Introduction.ExSala;

import javax.swing.*;
import java.text.DecimalFormat;

public class Ex2 {
    public static void main(String[] args) {
        int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas foram trabalhadas? "));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Valor da hora de trabalho: "));
        double valorSalario = valorHora * horasTrabalhadas;
        double salarioSemanal = horasTrabalhadas * valorHora;
        if(horasTrabalhadas > 40){
            salarioSemanal += (horasTrabalhadas-40) * valorHora;
        }
        DecimalFormat df = new DecimalFormat("R$ #, ##0.00");
        JOptionPane.showMessageDialog(null, "O funcionário receberá " +df.format(salarioSemanal));
    }
}
