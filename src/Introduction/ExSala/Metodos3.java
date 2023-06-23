package Introduction.ExSala;

public class Metodos3 {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int z = 7;
        int w = 10;
        int p = soma(x, y);
        int q = soma(z, w);
        int r = soma(p, q);
        System.out.println(r);
    }
    static int soma(int a, int b){
        int c = a + b;
        return c;
    } 
}
