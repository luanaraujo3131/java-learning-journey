/**
 * write a program to read a number N, then the name, id and salary ou N employees
 * Then, calculate the increase of X percente, X and id will be defined by user. If user give a nonexistent
 * id, show a menssage and abort operation.
 * */

package AlgorithmsAndDataStructure.Collection.List.ArrayList;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employees> list = new ArrayList<>();
        System.out.println("How many employees will be added?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Name: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)){//if id it's in the list.........
                System.out.println("Id already exists! Try again: ");
                id = sc.nextInt();
            }

            sc.nextLine();
            System.out.println("Salary: ");
            float salary = sc.nextFloat();
            sc.nextLine();

            Employees emp = new Employees(name, id, salary);

            list.add(emp);
        }
        System.out.print("Enter the id that will have salary incresed: ");
        int idSalary = sc.nextInt();

        Employees emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        //If I don't want to use PositionId, I can do this way ^, with lambda expression

        //Integer pos = PositionId(list, idSalary);this way, I call PositionId function

        if (emp == null){
            System.out.println("Id doesn't exist");
        } else {
            System.out.print('\n'+"Enter the percentage:");
            float percent = sc.nextFloat();
            emp.IncreaseSalary(percent);
        }
        System.out.println();
        System.out.println('\n'+ "List of employees: ");
        for (Employees e : list){
            System.out.println(e);
        }
        sc.close();
    }

    public static Integer PositionId(List<Employees> list, int id){
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i; //return position
            }
        }
        return null; //nothing was found
    }
    public static boolean hasId(List<Employees> list, int id){
        Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null; //verify if the id exists.
    }
}
class Employees{
    private String name;
    private int id;
    private float salary;

    public Employees(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void IncreaseSalary(float percentage){
        salary += salary * percentage / 100f;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Id: " + id + '\n' +
                "Salary: " +String.format("%.2f", salary) + '\n';

    }
}
