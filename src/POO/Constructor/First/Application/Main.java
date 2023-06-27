package POO.Constructor.First.Application;

import POO.Constructor.First.Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Como criamos o construtor na nossa classe Product, criamos variáveis tempórarias aqui para garatirmos
        //que tenhamos valores
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        //Agora sim criamos o objeto e referenciamos os seus atributos!
        Product product = new Product(name, price, quantity);
        //garantimos que o esses objetos tenham valor, previndo que haja problemas por ter valores nulos ou 0(sem valor)

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();


        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
