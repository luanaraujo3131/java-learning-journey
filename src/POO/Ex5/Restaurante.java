package POO.Ex5;

import javax.swing.*;

public class Restaurante {
    public static void main(String[] args) {
        Conta[] contas = new Conta[20];
        for (int i = 0; i < contas.length; i++) {
            contas[i] = new Conta();
        }
        int opcao;
        String[] opcoes = {"Efetuar pedido", "Fechar conta", "Fazer pagamento"};
        do {
            opcao = JOptionPane.showOptionDialog(null, "Qual a ação do cliente?",
                    "Mini gerencia de restaurante", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null, opcoes, null);
            int mesa = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a mesa que está solicitando o atendimento?"));
            if(opcao == JOptionPane.YES_OPTION) { // Efetuar pedido
                contas[mesa].efetuarPedido();
            } else if(opcao == JOptionPane.NO_OPTION) { // Fechar conta
                contas[mesa].fecharConta();
            } else if(opcao == JOptionPane.CANCEL_OPTION) { // Fazer pagamento
                contas[mesa].efetuarPagamento();
            }
        } while(opcao != JOptionPane.CLOSED_OPTION);
    }
}

