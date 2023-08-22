package OOP.Polymorphism.Ex.app;

import OOP.Polymorphism.Ex.entities.ImportedProduct;
import OOP.Polymorphism.Ex.entities.Product;
import OOP.Polymorphism.Ex.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List <Product> listOfProducts = new LinkedList<>();

        System.out.print("Number of products: ");
        short n = sc.nextShort();
        sc.nextLine();
        for (short i = 1; i <= n; i++){
            System.out.print("Product #" +i+ " data:");
            System.out.println("-------------------------");
            System.out.print("Common, used or imported?");
            String kindaProduct = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price:");
            double price = sc.nextDouble();
            sc.nextLine();

            if (kindaProduct.equalsIgnoreCase("Common")){
                Product product = new Product(name, price);
                listOfProducts.add(product);
            } else if (kindaProduct.equalsIgnoreCase("Used")) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");

                System.out.print("Enter the manufacturing date:");
                String manufacturingDateStr = sc.nextLine();
                sc.nextLine();

                try {
                    Date manufacturingDate = simpleDateFormat.parse(manufacturingDateStr);
                    Product product = new UsedProduct(name, price, manufacturingDate);
                    listOfProducts.add(product);
                } catch (ParseException e){
                    System.out.println("Invalid date format. Please use yyyy-MM-dd.");
                }
            } else if(kindaProduct.equalsIgnoreCase("Imported")){
                System.out.print("Customers fee:");
                Double customerFee = sc.nextDouble();
                sc.nextLine();

                Product product = new ImportedProduct(name, price, customerFee);
                listOfProducts.add(product);
            } else {
                System.out.println("Invalid product type.");
            }
        }
        System.out.println();
        System.out.println("Price tags: ");
        for (Product products: listOfProducts) {
            System.out.println(products.priceTag());
        }
    }
}
