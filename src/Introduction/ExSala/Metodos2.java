package Introduction.ExSala;

import javax.swing.JOptionPane;

public class Metodos2 {
    public static void main(String[] args) {
        mostraAviso();
        mostraAviso();
        mostraAviso();
        mostraAviso();
//        mostraAviso("revoada de pombo bravo.");
        mostraAvisoPersonalizado("Gato bravo.");
    }
    
    static void mostraAviso() {
        JOptionPane.showMessageDialog(null, "Cuidado!\nCão bravo.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    
    static void mostraAvisoPersonalizado(String informacao) {
        JOptionPane.showMessageDialog(null, "Cuidado!\n"+informacao, "Aviso", JOptionPane.WARNING_MESSAGE);
    }
}
