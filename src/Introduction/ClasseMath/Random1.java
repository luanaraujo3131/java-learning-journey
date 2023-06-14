package Introduction.ClasseMath;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random ran = new Random();
        int firstRandom = ran.nextInt();
        System.out.println("First random: " +firstRandom);

        int limitedRandom = ran.nextInt(10); //limited to 10 numbers, it started on 0 and goes up to 10.
        System.out.println(limitedRandom);

        int intervaledRandom = ran.nextInt(20, 40);//it gives one number between 20 and 40
        System.out.println(intervaledRandom);
    }
}
