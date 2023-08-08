package POO.Exemplos.Imersao.com.test.bank.model;

import java.util.Objects;

//é uma boa prática válidar os métodos
public abstract class Conta {
    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;
    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoDisponivel(){
        return getSaldo();
    }

    //construtor
    public Conta(){}
    //Isso permite q eu crie um objeto sem passar os valores no paramêtro()
    //Se eu criar um construtor, como o a baixo, devo sempre criar os objetos dentro do paramêtro
    //tendo os dois contrutores, eu posso criar objetos da mesma maneira, dentro ou fora do param...
    //Isso é uma sobrecarga
    public Conta(Pessoa titular, int agencia, int numero){
        Objects.requireNonNull(titular);//di que Titular(pessoa) não pode ser nulo
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void depositar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }
        saldo += valor;
    }
    public void sacar(double valor){
        if (getSaldoDisponivel() - valor < 0){
            throw new IllegalStateException("Saldo insuficiente");//saldo negativo
        }
        saldo -= valor;
    }
    public void sacar(double valor, double taxaSaque){
        sacar(valor + taxaSaque);
    }
    public abstract void debitarTarifaMensal();
    //Isso obriga as subclasses de herdam da superclasse "Conta" (ContaEspecial e ContaInvestimento)
    // a implementarem o método "debitarTarifaMensal", pois, nesse exemplo, essa debitação pode ser
    // diferente para as duas classes
}
