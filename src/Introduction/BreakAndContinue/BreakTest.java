package Introduction.BreakAndContinue;

public class BreakTest {
    public static void main(String[] args) {
        int contador;
        for (contador = 1; contador <= 10; contador++){
            if (contador == 5)
                break;//quando chegar na interação 4, o programa para de iterar

            System.out.printf("%d ", contador);
        }
        System.out.printf("%nPausou o loop no contador = %d%n", contador);
    }
}
