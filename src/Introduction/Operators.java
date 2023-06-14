package Introduction;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int sum;
        int sub;
        int mult;
        //int div;

        System.out.println("Write the first number: ");
        num1 = input.nextInt();

        System.out.println("Write the second number");
        num2 = input.nextInt();

        sum = num1 + num2;
        System.out.println(sum);

        sub = num1 - num2;
        System.out.println(sub);

        mult = num1 * num2;
        System.out.println(mult);

        //div = num1 / num2

        if(num1 == num2)
            System.out.printf("%d == %d%n", num1, num2);
        //%d representa o num1 e o outro %d representa o num2, se quisermos
        //usar essa estrutura, devemos usar o "PRINTF". o %n serve para
        //pular uma linha
        //o "F" de printf, significa formatado
        if(num1 != num2)
            System.out.printf("%d diferente de %d%n", num1, num2);
        if(num1 < num2)
            System.out.printf("%d menor que %d%n", num1, num2);
        if(num1 > num2)
            System.out.printf("%d maior que %d%n", num1, num2);
        if(num1 <= num2)
            System.out.printf("%d <= %d%n", num1, num2);
        if(num1 >= num2)
            System.out.printf("%d >= %d%n", num1, num2);
    }
}
