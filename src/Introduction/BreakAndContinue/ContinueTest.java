package Introduction.BreakAndContinue;

public class ContinueTest {
    public static void main(String[] args) {
        for (int contador = 1; contador <= 10; contador++){
            if (contador == 5)
                continue;//quando chegar no 5(if(...==5)) ele, pula o 5 e continua a iteração

            System.out.printf("%d ", contador);
        }
        System.out.printf("Pulou o 5");
    }
}
