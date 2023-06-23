package Introduction.ExSala;

public class ContaCorrenteTest {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.efetuaDeposito(1000);
        cc.efetuaSaque(50);
        System.out.println("Saldo atual: "+cc.saldo);
    }
}
