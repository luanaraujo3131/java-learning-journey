package Introduction;

import javax.swing.*;

/**
 * enviando e recebendo dados
 * @author Luan
 *
 * */

public class Ex3 {
    public static void main(String[] args){
        /*JOptionPane so obtem valores textuais. Podemos extrair valores inteiros de um texto atraves do comando:
        int numero = Integer.parseInt(variavel);*/

        String numero1 = JOptionPane.showInputDialog("Write a number: ");
        int num = Integer.parseInt(numero1);

        String numero2 = JOptionPane.showInputDialog("Write another number: ");
        int num2 = Integer.parseInt(numero2);

        int soma = num + num2;

        JOptionPane.showMessageDialog(null,  num + " + " + num2 + " = " + soma);
        System.out.println(num + " + " + num2 + " = " + soma);
    }
}