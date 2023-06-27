package Introduction;

public class FunctionsForStrings {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG";
        String fuction1 = original.toLowerCase();
        String function2 = original.toUpperCase();
        String function3 = original.trim();
        String function4 = original.substring(3); //incia uma nova str a partir da string número 3
        String function5 = original.substring(2, 8);//inicia na string 2 e vai até a 8
        String function6 = original.replace('a', 'x');//troca todos os 'a' por 'x'
        String function7 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: " +original);
        System.out.println("toLowerCase(): " +fuction1);
        System.out.println("toUpperCase: " +function2);
        System.out.println("Trim: " +function3);
        System.out.println("Substring: "+function4);
        System.out.println("Substring(2 a 8) " +function5);
        System.out.println("Replace 'a' for 'x': " +function6);
        System.out.println("Replace(abc for xy): " +function7);
        System.out.println("Index of bc: " +i);
        System.out.println("Last index of bc: " +j);

        //Colocando uma String no array com o método split
        String s = "Coentro no feijão";
        String[] arrayDeS = s.split(" ");
        System.out.println(arrayDeS[0]);
        System.out.println(arrayDeS[1]);
        System.out.println(arrayDeS[2]);
    }
}
