package POO.Ex2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Carro Ferrari = new Carro();
        Carro Lamborghini = new Carro();
        Carro S10 = new Carro();
        Ferrari.mudarPlaca("ALRJD32");
        Lamborghini.mudarPlaca("LAOSEI23");
        S10.mudarPlaca("HASJHS105");
        Ferrari.mudarCor("Vermelho");
        Lamborghini.mudarCor("Preto");
        S10.mudarCor("Branca");

        JOptionPane.showMessageDialog(null, "Cor: " +Ferrari.corAtual()+ "\n"+ "Placa: " +Ferrari.placaAtual());
        JOptionPane.showMessageDialog(null, "Cor: " +Lamborghini.corAtual()+ "\n"+ "Placa: " +Lamborghini.placaAtual());
        JOptionPane.showMessageDialog(null, "Cor: " +S10.corAtual()+ "\n" + "Placa: " +S10.placaAtual());
    }
}
