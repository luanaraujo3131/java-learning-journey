package Functional.Course.Ex2;

import java.util.Arrays;

public class program {

    public static final byte globalValue = 3;
    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 5};
        changeOddValues(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void changeOddValues(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0){
                numbers[i] += globalValue;
                //add the globalValue(3)
                //3 + 3 = 6
                //4 is even, so don't add
                //5 + 3 = 8
            }
        }
    }
}

/**
 *  Note that the value provided in changeOddValues() function 
 * depends on the external value(globalValue). In this case
 * = 3, but if this number change, for example, to 10, each
 * value resulted by the function will also change. This concept
 * is called by Referential transparency, which is the ability  
 * to replace an expression with its result, without changing 
 * the meaning/behavior of the program.
 *  This is a strong aspect of functional program and pure 
 * functions. 
 */
