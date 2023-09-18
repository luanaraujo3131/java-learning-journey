package AlgorithmsAndDataStructure.Collection.InterfaceComperable.NameAndSalary.entities;

public class Employee implements Comparable<Employee>{
    private String name;
    private Float salary;

    public Employee(String name, Float salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    //retorna os nomes dos funcionários de maneira ordenada
    @Override
    public int compareTo(Employee otherEmployee) {
        return name.compareTo(otherEmployee.getName());
        /*
         * Podemos ordenar a lista por salário:
         * @return salary.compareTo(otherEmployee.getSalary());
         */
    }

    
}
