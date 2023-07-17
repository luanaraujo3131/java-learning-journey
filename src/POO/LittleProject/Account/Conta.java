package POO.LittleProject.Account;

import java.util.Random;

public class Conta {
    private int numConta;
    private String nome;
    private String cpf;
    private double saldo;

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //construtor
    public Conta(String nome, String cpf, double saldo){
        this.numConta = gerarNumConta();
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }
    private int gerarNumConta(){
        Random random = new Random();
        int numero = random.nextInt(900000) + 100000; // gera um número entre 100000 e 999999
        return numero;
    }
    public double fazerDeposito(double saldo, double valorDeposito){
        saldo += valorDeposito;
        return saldo;
    }
}
