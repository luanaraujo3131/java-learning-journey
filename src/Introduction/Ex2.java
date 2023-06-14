package Introduction;

import javax.swing.*;

public class Ex2 {
    public static void main(String[] args){
        JOptionPane.showInputDialog("Can you write? ");

        //processing data into a variable
        String text = JOptionPane.showInputDialog("Write something: ");
        JOptionPane.showMessageDialog(null, text);

        System.out.println("You writed: " + text);
    }
}
