package Tester;
import java.util.Arrays;


public class Test {
    public static void main(String[] args) {
        Student[] students = {new Student("John"), new Student("Marie")};
        System.out.println(Arrays.toString(students));
    }
}

class Student{
    private String name;

    public Student(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public String toString(){
        return "Student{" + "Name = " + name + "}";
    }
}
