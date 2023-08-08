package AlgorithmsAndDataStructure.DataStructure.Arrays;

import java.util.Scanner;

public class ForEach {
    /**
     * for(type name: colection){
     *      command x;
     *      comamnd y;
     *      ...
     * }
     * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arrString[] = new String[] {"Luan", "Maria", "Bob", "Yasmin"};
        //for(int i = 0; i < arrString.length; i++){
        //      command....
        //}
        for (String names : arrString){
            System.out.print(names+ " ");
            System.out.println();
        }

        int[] arrInt = new int[5];
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println("Write a number:");
            arrInt[i] = sc.nextInt();
        } //we can't receive data with a forEach loop............
        for (int num : arrInt) {
            System.out.print(num+ " ");
        }
    }
}
