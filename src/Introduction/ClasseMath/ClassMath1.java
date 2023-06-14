package Introduction.ClasseMath;

public class ClassMath1 {
    public static void main(String[] args) {
        //arredondar:
        double num = 14.51;
        double arredondado = Math.round(num);
        System.out.println(arredondado);

        //PI, EULER
        double pi = Math.PI;
        double e = Math.E;
        System.out.println("Pi: " +pi+ " Euler: " +e);

        //Exponencial:
        System.out.println("O valor de e ao quadrado = " +Math.exp(2));
        System.out.println("Dois elevado ao cubo = " +Math.pow(2, 3));//2 valor a ser elevado, 3 é a potencia

        //Raiz quadrada:
        double raizDeTres = Math.sqrt(3);
        double raizDeNove = Math.sqrt(9);
        double raizDeQuatro = Math.sqrt(4);
        System.out.println(raizDeTres + raizDeQuatro + raizDeNove);

        //logaritmo (log)
        System.out.println("O logaritmo natural de 10 é = "+ Math.log(10));
        System.out.println("O logaritmo natural de 'e' é = "+ Math.log(Math.E));

        //Seno, cosseno e tangente:
        System.out.println("O seno de 90 é = "+ Math.sin( (Math.PI)/2 ));
        System.out.println("O cosseno de 0 é = "+ Math.cos(0));
        System.out.println("A tangente de 45 é= "+ Math.tan( (Math.PI)/4));
    }
}
