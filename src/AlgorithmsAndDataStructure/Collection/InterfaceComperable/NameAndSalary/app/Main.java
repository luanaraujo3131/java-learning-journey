package AlgorithmsAndDataStructure.Collection.InterfaceComperable.NameAndSalary.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import AlgorithmsAndDataStructure.Collection.InterfaceComperable.NameAndSalary.entities.Employee;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        String path = "listOfNameAndSalary.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String employeeCSV = bufferedReader.readLine();
            while(employeeCSV != null){
                //Divide a String pelo ", ", repare que o texto está assim nome, salario.
                //Então o que vem antes da virgula [0] é o nome, e depois [1] é o salário.
                //O método trim() usado remove espaços em branco de uma string
                String fields[] = employeeCSV.split(",");
                list.add(new Employee(fields[0].trim(), Float.parseFloat(fields[1].trim())));
                employeeCSV = bufferedReader.readLine();
            }

            Collections.sort(list);//ordena os nomes

            for(Employee employee : list){
                System.out.println(employee.getName() +", "+ employee.getSalary());
            }
        } catch(IOException e){
            System.out.println("Erro: " +e.getMessage());
        }
    }
}
