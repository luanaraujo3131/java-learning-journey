package Introduction;

import java.util.Scanner;

public class RepeticaoFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quatidade de numeros que voce quer somar:");
        int n = input.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {
            //System.out.println(i);
            System.out.println("Digite um valor para x");
            int x = input.nextInt();
            soma = soma + x;
        }
        System.out.println("Resultado da soma desses numero: " + soma);

        //Imprimindo numeros em um espaco de tempo determinado
        System.out.println("Digite um numero para faermos uma tabela: ");
        int y = input.nextInt();
        for (int a = 0; a <= y; a++) {
            System.out.println(a);
        }
    }
}
