//calculando o fatorial sem static

package Introduction;

import java.util.Scanner;

public class Fatorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //como o método calcularFatorial não está static, temos que instânciar
        //o objeto
        Fatorial2 fatorial2 = new Fatorial2();

        System.out.println("Digite um número para calcular o fatorial:");
        int num = sc.nextInt();
        int resultado = fatorial2.calcularFatorial(num);
        System.out.println(resultado);
    }
    public int calcularFatorial(int num){
        int fator = 1;
        for(int i = num; i > 1; i--){
            fator *= i;
        }
        return fator;
    }

}
