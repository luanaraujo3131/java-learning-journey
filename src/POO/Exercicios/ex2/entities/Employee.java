package POO.Exercicios.ex2.entities;

public class Employee {
    public String name;
    public double GrossSalary; //salário bruto
    public double tax;

    public double netSalary(){//salario - imposto
        return GrossSalary - tax;
    }

    public void IncreaseSalary(double percentetage){
        GrossSalary += GrossSalary * percentetage / 100.0;
    }

    public String toString(){
        return name + ", salary without tax: $" +String.format("%.2f", GrossSalary)+ " Salaray with tax: $" + String.format("%.2f", netSalary());
    }

}
