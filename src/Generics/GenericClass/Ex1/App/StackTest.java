package Generics.GenericClass.Ex1.App;

import Generics.GenericClass.Ex1.Entities.EmptyStackException;
import Generics.GenericClass.Ex1.Entities.Stack;

public class StackTest {
    public static void main(String[] args) {
        float[] floatElements = {(float) 1.5, (float) 3.5, 4.9f, 5.5f};
        int[] intElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Stack<Float> floatStack = new Stack<>(5);
        Stack<Integer> intStack = new Stack<>();

        testPushFloat(floatStack, floatElements);
        testPopFloat(floatStack);

        testPushInteger(intStack, intElements);
        testPopInteger(intStack); 
    }

    private static void testPushFloat(Stack<Float> stack, float[] values){
        System.out.printf("%nPushing elements onto floatStack%n");
        for(float value : values){
            System.out.printf("%.1f", value);
            stack.push(value);
        }
    }

    private static void testPopFloat(Stack<Float> stack){
        try{
            System.out.printf("%nPopping elements from floatStack%n");
            float popValue;
            while(true){
                popValue = stack.pop();
                System.out.printf("%.1f", popValue);
            }
        } catch(EmptyStackException e){
            System.err.println();
            e.printStackTrace();
        }
    }

    private static void testPushInteger(Stack<Integer> stack, int[] values){
        System.out.printf("%nPushing elements onto IntegerStack%n");
        for (int value : values) {
            System.out.printf("%.d", value);
            stack.push(value);
        }
    }

    private static void testPopInteger(Stack<Integer> stack){
        try{
            System.out.printf("%nPopping elements from integerStack%n");
            int popValue;
            while(true){
                popValue = stack.pop();
                System.out.printf("%d ", popValue);
            }
        } catch(EmptyStackException e){
            System.err.println();
            e.printStackTrace();
        }
    }
}
