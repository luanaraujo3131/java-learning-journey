package Introduction;

import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um dia em numero: ");
        int dia = sc.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sabádo");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        sc.close();
    }
}
