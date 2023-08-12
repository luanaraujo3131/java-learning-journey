package Enumeration.Ex.app;

import Enumeration.Ex.entities.Client;
import Enumeration.Ex.entities.Order;
import Enumeration.Ex.entities.OrderItem;
import Enumeration.Ex.entities.Enum.OrderStatus;
import Enumeration.Ex.entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        System.out.println("Enter the cliente data: ");
        System.out.println("-------------------------");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY):");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Order data:");
        System.out.println("-------------------");
        System.out.print("Status (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED):");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order order = new Order(new Date(), status, client);

        System.out.print("How many itens to this order? ");
        int quantityOfItens = sc.nextInt();
        for (int i = 1; i <= quantityOfItens; i++){
            System.out.println("Enter the #"+i+" item data");
            System.out.println("---------------------------");
            System.out.print("Product name:");
            sc.next();
            String prodName = sc.nextLine();
            System.out.print("Product price:");
            double prodPrice = sc.nextDouble();
            System.out.print("Quantity:");
            int quantity = sc.nextInt();

            Product product = new Product(prodName, prodPrice);

            OrderItem orderItem = new OrderItem(quantity, prodPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);


        sc.close();
    }
}
