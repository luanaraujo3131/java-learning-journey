package Introduction;

import java.util.Scanner;

public class Fatorial3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //como o método calcularFatorial está static, podemos usá-lo sem ter que instânciar um objeto
        //como é possível ver, o resultado é o mesmo, o que muda é a forma em que chamamos os métodos.

        System.out.println("Digite um número para calcular o fatorial:");
        int num = sc.nextInt();
        int resultado = calcularFatorial(num);
        System.out.println("Fatorial: " +resultado);
    }
    public static int calcularFatorial(int num){
        int fator = 1;
        for(int i = num; i > 1; i--){
            fator *= i;
        }
        return fator;
    }
}
