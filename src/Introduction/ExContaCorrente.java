package Introduction;

public class ExContaCorrente {
    public void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.efetuaDeposito(100);
        cc.efetuaSaque(10);
        System.out.println("Saldo atual: " +cc.saldo);
    }

    public class ContaCorrente{
        float saldo;

        void efetuaSaque(float valor){
            saldo -= valor;
        }
        void efetuaDeposito(float valor){
            saldo += valor;
        }
    }

}
