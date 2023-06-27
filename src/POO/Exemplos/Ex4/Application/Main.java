package POO.Exemplos.Ex4.Application;

import POO.Exemplos.Ex4.Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Products data: ");

        System.out.print("Name: ");
        product.name = input.nextLine();

        System.out.print("Price: ");
        product.price = input.nextDouble();

        System.out.println("Quantity in stock: ");
        product.quantity = input.nextInt();

        System.out.println();
        System.out.print("Product data: " +product);

        System.out.println();
        System.out.print("Enter the number of product to be added in stock: ");
        int quantity = input.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.print("Updated data: " +product);

        System.out.println();
        System.out.print("Enter the number of product to be removed in stock: ");
        quantity = input.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.print("Updated data: " +product);

        input.close();
    }
}
