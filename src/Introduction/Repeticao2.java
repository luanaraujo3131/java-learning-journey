package Introduction;

import java.util.Scanner;

public class Repeticao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;
        do {
            System.out.println("Escolha uma das opções: \nCumprimento \nElogio \nDespedida ou \nSair");
            opcao = sc.next();
            switch (opcao) {
                case "Cumpremento":
                    System.out.println("Boa tarde!");
                    break;
                case "Elogio":
                    System.out.println("Parabéns!");
                    break;
                case "Despedida":
                    System.out.println("Até breve!");
                    break;
                case "Sair":
                    System.out.println("Saiu do programa");
                    break;
                default: // Optativo
                    System.out.println("Opção inválida.");
            }
        } while (!opcao.equals("Sair"));
    }
}
