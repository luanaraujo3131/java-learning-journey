/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction.ExSala.POO.Restaurante;

import javax.swing.JOptionPane;
import java.text.*;
public class Conta {
    private float subtotal;
    DecimalFormat df = new DecimalFormat("R$ #,##0.00");
    public void efetuarPedido() {
        float valor = Float.parseFloat(JOptionPane.showInputDialog
                                        ("Qual o valor do pedido?"));
        subtotal += valor;
    }
    public void fecharConta() {
        String s = "Valor do Consumo: "+df.format(subtotal);
        s += "\nSugestão de gorjeta: "+df.format(subtotal*0.1);
        s += "\nTotal com gorjeta: "+df.format(subtotal*1.1);
        JOptionPane.showMessageDialog(null, s);
    }
    public void efetuarPagamento() {
        float valorPago = Float.parseFloat(JOptionPane.showInputDialog
                                        ("Quanto o cliente pagou?"));
        float gorjeta = valorPago-subtotal;
        if(gorjeta >= 0) {
            JOptionPane.showMessageDialog(null, "O cliente deixou "+
                                        df.format(gorjeta)+" para o garçom.");
        } else {
            JOptionPane.showMessageDialog(null, "O garçom levou um calote de "+
                                        df.format(-gorjeta)+".");
        }
        subtotal = 0;
    }
}
