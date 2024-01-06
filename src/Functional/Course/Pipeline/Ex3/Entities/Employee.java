package Functional.Course.Pipeline.Ex3.Entities;

public record Employee(String name, String email, Double salary) {
    
    @Override
    public String toString() {
        return String.format("Employee { name = '%s', email = '%s', salary = %.2f}%n", name, email, salary);
    }
}
