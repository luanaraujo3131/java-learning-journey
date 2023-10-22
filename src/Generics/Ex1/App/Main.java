package Generics.Ex1.App;

import java.util.Scanner;

import Generics.Ex1.Entities.PrintService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintService<Integer> printService = new PrintService<>();

        /**
         * No paramêtro da lista (<>), está definido como Integer, mas perceba que esta-
         * mos colocando o tipo aqui, no main, mas na classe PrintService a list tem como
         * paramêtro um tipo <T>, mas esse T não é definido lá, ele nos fala, basicamente,
         * o seguinte: Essa classe (que é um lista) pode ser qualquer tipo(String, byte,
         * Object, etc.), mas uma ve definido o seu tipo, como foi definido um <Integer>,
         * ela não pode mais mudar.
         */

        System.out.println("How many values?");
        int values = sc.nextInt();
        for(int i = 0; i < values; i++){
            System.out.print("Write a number:");
            int number = sc.nextInt();
            printService.addValue(number);
            //printService.addValue("Olá, mundo!"); type safety entra em ação. Não podemos
            //adicionar uma String, pois a lista foi definida como o Interger
        }
        printService.print();
        System.out.println("First number: " +printService.first());
    
        sc.close();
    }
}
