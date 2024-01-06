package Functional.Course.Stream;

import java.util.*;
import java.util.Arrays;
import java.util.stream.*;

public class Ex1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        
        Stream<Integer> stream1 = list.stream();

        //para cada elemento x, multiplique x por 10
        Stream<Integer> stream2 = list.stream().map(x -> x * 10);

        Stream<String> stream3 = Stream.of("Peter Parker, Bruce Lee, Clark Kent");

        //Esse iterate vai interando, de acordo com uma regra passada como paramêtro
        //definimos onde inicia(0) e o regra de iteração(x -> x + 2, -vá de 2 em 2=). Mas
        //note que precisamos de uma condição de parada(limit()), se não o programa ficará 
        //iterando números eternamente. Se rodarmos o programa, vemos que esse stream
        //iterará os elementos de 2 em 2 até 98(de 0 à 98 dá 50 elementos(que foram passados
        //como condição de parada(limit)), nesse caso, os primeiros 50 números pares.
        Stream<Integer> streamIntereted = Stream.iterate(0, x -> x + 2).limit(50);

        Stream<Long> fibonacci = Stream.iterate(new Long[]{0L, 1L}, 
                                            p -> new Long[] {p[1], p[0]+p[1]})
                                            .map(p -> p[0]);
        
        //metodo toArray vem da stream*
        System.out.println(Arrays.toString(stream1.toArray()));
        System.out.println(Arrays.toString(stream2.toArray()));
        System.out.println(Arrays.toString(stream3.toArray()));
        System.out.println("Primeiros 50 números pares:");
        System.out.println(Arrays.toString(streamIntereted.toArray()));
        System.out.println("20 primeiros números de fibonacci:");
        System.out.println(Arrays.toString(fibonacci.limit(20).toArray()));
    }
}
