package OOP.Exemplos.Ex1.Controle;

import OOP.Exemplos.Ex1.Utilidade.Data;

public class Conta {
    private int numeroConta;
    private double saldo;
    private Data dataAbertura;
    private Correntista[] correntistas;

    //Construtor:
    public Conta(int numeroConta, double saldo, Data dataAbertura, Correntista[] correntistas, double monto){
        this.numeroConta = numeroConta;
        this.dataAbertura = dataAbertura;
        this.correntistas = correntistas;
        this.saldo = monto;
    }
    public String toString(){
        String resposta = "Número da conta: " +numeroConta+ " Saldo: " +saldo+ " data de abertura: " +dataAbertura;
        //laço para imprimir os correntista:
        for (int i = 0; i < correntistas.length; i++){
            resposta = resposta + " " +correntistas[i];
        }
        return resposta;
    }
    //monto: valor da conta
    //nesses casos, podemos usar tanto o boolena como o void
    public boolean fazerDeposito(double monto){
        if(monto >= 0){
            saldo += monto;
            return true;
        } else{
            return false;
        }
    }
    public boolean fazerSaque(double monto){
        if(saldo >= monto) {
            saldo -= monto;
            return true;
        } else {
            return false;
        }
    }
    public boolean fazerTransferencia(Conta destino, double monto) {
        if (this.fazerSaque(monto) == true) {
            destino.fazerDeposito(monto);
            return true;
        } else {
            return false;
        }
    }
}
