package Generics.GenericClass.Ex1.Entities;

import java.util.ArrayList;

public class Stack<T> {
    
    private final ArrayList<T> elements;

    public Stack(){
        this(10); //Tamanho padrão da lista
    }

    public Stack(int capacity){
        //Se capacidade for > 0 insere o valor após "?"
        //caso contrário, retorna "10"(valor padrão)
        int initCapacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<T>(initCapacity);
    }

    public void push(T pushValue){
        elements.add(pushValue);
    }

    public T pop(){
        if(elements.isEmpty())
            throw new EmptyStackException("Stack is empty");
        return elements.remove(elements.size() - 1);
    }
}
