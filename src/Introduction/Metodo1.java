package Introduction;

import javax.swing.*;

public class Metodo1 {
    public static void main(String[] args) {
        mostrarAviso();
        mostrarAviso();
        mostrarAviso();
        mostrarAviso();

        mostrarAvisoPersonalizado("Gato bravo. Gado D+ KKKKKK");
    }

    static void mostrarAviso(){
        JOptionPane.showMessageDialog(null, "Cuidado!\nCão bravo.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
    static void mostrarAvisoPersonalizado(String informacao){
        JOptionPane.showMessageDialog(null, "Cuidado!\n"+informacao, "Aviso", JOptionPane.WARNING_MESSAGE);
    }
}
