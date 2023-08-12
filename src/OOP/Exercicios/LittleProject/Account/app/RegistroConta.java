package OOP.Exercicios.LittleProject.Account.app;

import OOP.Exercicios.LittleProject.Account.Entities.Conta;

import java.util.Scanner;

public class RegistroConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta1 = null;
        System.out.println("Número da conta: ");
        int numConta = sc.nextInt();
        System.out.println("Nome:");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Tem depósito inicial?(y/n");
        char resposta = sc.next().charAt(0);
        if (resposta == 'y' || resposta == 'Y') {
            System.out.println("Entre com o valor inicial: ");
            double depositoInicial = sc.nextDouble();
            conta1 = new Conta(numConta, nome, depositoInicial);//construtor com 3 argumentos
        } else if (resposta == 'n' || resposta == 'N') {
            conta1 = new Conta(numConta, nome);//esse é o meu construtor com 2 argumentos
        } else {
            System.out.println("Digite 'y' para sim ou 'n' para não");
        }

        System.out.println(conta1 +"\n");

        int escolha;
        do {
            System.out.println("Qual operação você gostaria de realizar:");
            System.out.println("1. Deposito");
            System.out.println("2. Saque");
            System.out.println("3. Sair");
            escolha = sc.nextInt();
            conta1.operacao(escolha);
        } while (escolha != 3);

        System.out.println(conta1);

        sc.close();
    }
}
