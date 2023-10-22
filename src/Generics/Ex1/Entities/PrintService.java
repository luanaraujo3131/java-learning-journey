package Generics.Ex1.Entities;

import java.util.LinkedList;
import java.util.List;

public class PrintService<T> {//esse <T> pode ser qualquer nome que quisermos dar
    //Isso serve para garantir o reuso(podemos usar essa lista para qualquer tipo) 
    //e garante também o type safety.
    public List<T> list = new LinkedList<>();

    public void addValue(T value){
        list.add(value);
    }

    public T first(){
        if(list.isEmpty())
            throw new IllegalArgumentException("List is empty!");
        return list.get(0);//first element
    }

    public void print(){
        System.out.print("[");
        if(!list.isEmpty())//list is not empty
            System.out.print(list.get(0));
        for(int i = 1; i < list.size(); i++){
            System.out.print(", " +list.get(i));
        }    
        System.out.println("]");
    }
}
