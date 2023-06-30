package Exceptions;

import javax.swing.*;

public class Ex1 {
    public static void main(String[] args){
        try{
            String tex1 = JOptionPane.showInputDialog("Digite o dividendo:");
            int dividendo = Integer.parseInt(tex1);
            String text2 = JOptionPane.showInputDialog("Digite o divisor:");
            int divisor = Integer.parseInt(text2);
            int quociente = dividendo / divisor;
            JOptionPane.showMessageDialog(null, "Quociente entre os dois: " +quociente);
        } catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Não há concientes para divisores por 0");
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O input deve ser um número");
        } finally {
            JOptionPane.showMessageDialog(null, "Executa de qualquer maneira!! E fecha a conexão.");
        }
        System.out.println("O programa continua");
    }
}
