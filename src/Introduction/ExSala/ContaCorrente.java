package Introduction.ExSala;

public class ContaCorrente {
    float saldo;
    
    void efetuaSaque(float valor) {
        saldo -= valor;
    }
    void efetuaDeposito(float valor) {
        saldo += valor;
    }
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.efetuaSaque(50);
    }
}
