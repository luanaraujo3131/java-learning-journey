package Generics.GenericClass.Ex1.Entities;

public class EmptyStackException extends RuntimeException{

    public EmptyStackException(){
        this("Stack is empty");
    }

    public EmptyStackException(String mensage){
        super(mensage);
    }
}
