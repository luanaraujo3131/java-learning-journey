package POO.Exemplos.Ex5;

import javax.swing.*;
import java.text.DecimalFormat;

public class Conta {
    float subtotal;
    DecimalFormat df = new DecimalFormat("R$ #,##0.00");
    void efetuarPedido(){
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor do pedido: "));
        subtotal += valor;
    }
    void fecharConta(){
        String s = "Valor de consumo: " +df.format(subtotal);
        s += "\nSugestão de gorjeta: " +df.format(subtotal * 0.1);
        s += "\nTotal com gorjeta: " +df.format(subtotal * 1.1);
        JOptionPane.showMessageDialog(null, s);
    }
    void efetuarPagamento(){
        float valorPago = Float.parseFloat(JOptionPane.showInputDialog("Valor pago pelo cliente: "));
        float gorjeta = valorPago - subtotal;
        if(gorjeta >= 0){
            JOptionPane.showMessageDialog(null, "O cliente deixou " +df.format(gorjeta)+ " para o graçom" );
        } else {
            JOptionPane.showMessageDialog(null, "O garçom levou um calote de " +df.format(gorjeta)+ ".");
        }
        subtotal = 0;
    }
}
