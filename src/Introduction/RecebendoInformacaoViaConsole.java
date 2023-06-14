package Introduction;

import java.util.Scanner;

public class RecebendoInformacaoViaConsole {
    public static void main(String[] args){
        Scanner text = new Scanner(System.in);
        System.out.println("Digite algo:");
        String texto = text.next();
        System.out.println("Texto digitado: " +texto);

        System.out.println("Digite um numero: ");
        int numero = Integer.parseInt(text.next());
        System.out.println("numero digitado: " +numero);
    }
}
