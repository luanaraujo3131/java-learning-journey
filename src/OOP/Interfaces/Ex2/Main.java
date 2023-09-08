package OOP.Interfaces.Ex2;

public class Main {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[4];

        payableObjects[0] = new Invoice("01234", "Seat", 2, 375.0f);
        payableObjects[1] = new Invoice("56789", "Tire", 4, 79.75f);
        payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00f);
        payableObjects[3] = new SalariedEmployee("Ellen", "Kristien", "222-22-2222", 1000.00f);

        System.out.println("Invoices and Employees processed polymorphically:");
        for (Payable currentPayable : payableObjects) {
            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount());
        }
    }
}
/*Perceba o uso do polimorfismo na interface: Estou chamando objetos
 *diferente da mesma maneira, payableObjects pode ser uma fatura(invoice) 
 *e pode ser o salario de um funcionário(SalariedEmployee). São coisas
 *complemente diferentes, mas ques estão ligadas via interface
 */