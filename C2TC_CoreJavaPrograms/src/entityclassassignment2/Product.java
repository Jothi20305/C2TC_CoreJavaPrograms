package entityclassassignment2;
import java.util.*;
public class Product {
	int productId;
    String productName;
    double price;

    void readDetails(Scanner sc) {
        System.out.print("Enter Product ID: ");
        productId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Product Name: ");
        productName = sc.nextLine();
        System.out.print("Enter Product Price: ");
        price = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
    }
}
