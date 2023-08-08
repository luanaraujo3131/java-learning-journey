package POO.Exercicios.LittleProject.Account.Entities;

import java.util.Random;
import java.util.Scanner;

public class Conta {
    Scanner sc = new Scanner(System.in);
    private int numeroConta;
    private String nome;
    private double saldo;
    private final double taxa = 5.0;

    public Conta(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public Conta(int numeroConta, String nome, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        deposito(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }//como o saldo só pode ser alterado por deposito, não colocamos o set

    public double getTaxa() {
        return taxa;
    }

    public void deposito(double valor){
        saldo += valor;
    }
    public void saque(double valor){
        saldo -= valor + getTaxa();
    }
    public int operacao(int opcao){
        switch (opcao) {
            case 1:
                System.out.println("Valor do depósito: ");
                double valorDeposito = sc.nextDouble();
                deposito(valorDeposito);
                System.out.println("Depósito realizado com sucesso!\n");
                return 1;
            case 2:
                System.out.println("Valor do saque: ");
                double valorSaque = sc.nextDouble();
                saque(valorSaque);
                System.out.println("Saque realizado com sucesso!\n");
                return 2;
            case 3:
                System.out.println("Obrigado por usar nosso aplicativo!\n");
                return 3;
            default:
                System.out.println("Selecione uma das opções disponíveis!");
                return -1;
        }
    }

    @Override
    public String toString() {
        return "Conta:" +
                "\n"+
                "-----------------------"+
                "\n"+
                "Numero conta:" + numeroConta +
                "\n"+
                "Nome:'" + nome + '\'' +
                "\n"+
                "Saldo: " + saldo;
    }
}
