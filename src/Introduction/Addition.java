package Introduction;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args){
        //cria um scanner para obter dados atraves de comando
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int soma;

        System.out.println("Write a number: ");
        num1 = input.nextInt();//read the first number

        System.out.println("Write another number");
        num2 = input.nextInt();//read the second number

        soma = num1 + num2;

        System.out.printf("Sum is %d%n", soma);
    }
}
