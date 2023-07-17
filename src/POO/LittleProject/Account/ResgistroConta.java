package POO.LittleProject.Account;

import java.util.Random;
import java.util.Scanner;

public class ResgistroConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = sc.next();
        System.out.println("Digite seu cpf");
        String cpf = sc.next();
        System.out.println("Digite o saldo");
        int saldo = sc.nextInt();
        Conta conta = new Conta(nome, cpf, saldo);
        int numeroConta = conta.getNumConta();

        System.out.println("CONTA:");
        System.out.println("--------------------------");
        System.out.println("Número da conta: " + conta.getNumConta());
        System.out.println("Nome: " + conta.getNome());
        System.out.println("CPF: " + conta.getCpf());
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
