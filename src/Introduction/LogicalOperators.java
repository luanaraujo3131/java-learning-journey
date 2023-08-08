package Introduction;

public class LogicalOperators {
    public static void main(String[] args) {
        //Tabela-verdade para o operador && (E condicional)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                          "Conditional AND (&&)",
                          "false && false", (false && false),
                          "false && true", (false && true),
                          "true && false", (true && false),
                          "true && true", (true && true));
        //Tabela-verdade para o operador || (OU condicional)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                          "Conditional OR (||)",
                           "false || false", (false || false),
                           "false || true", (false || true),
                           "true || false", (true || false),
                           "true || true", (true || true));
        //Tabela-verdade para o operador & (E lógico booleano)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                          "Conditional AND (&)",
                          "false & false", (false & false),
                          "false & true", (false & true),
                          "true & false", (true & false),
                          "true & true", (true & true));
        //Tabela-verdade para o operador | (OU inclusivo lógico booleano)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                          "Boolean logical inclusive OR (|)",
                          "false | false", (false | false),
                          "false | true", (false | true),
                          "true | false", (true | false),
                          "true | true", (true | true));

        //Tabela-verdade para o operador ^ (OU exclusivo lógico booleano)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                          "Boolean logical exclusive OR (^)",
                          "false ^ false", (false ^ false),
                          "false ^ true", (false ^ true),
                          "true ^ false", (true ^ false),
                          "true ^ true", (true ^ true));
        //Tabela-verdade para o operador ! (NEGAÇÃO LÓGICA)
        System.out.printf("%s%n%s: %b%n%s: %b%n", "Logical NOT (!)",
                          "!false", (!false), "!true", (!true));
    }
}
