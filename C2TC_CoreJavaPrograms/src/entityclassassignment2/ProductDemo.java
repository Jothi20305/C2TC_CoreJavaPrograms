package entityclassassignment2;
import java.util.*;
public class ProductDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Product[] products = new Product[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("\nEnter details for Product " + (i + 1) + ":");
            products[i] = new Product();
            products[i].readDetails(sc);
          }
        System.out.println("\n--- Product Details ---");
        for (int i = 0; i < 4; i++) {
            System.out.println("\nProduct " + (i + 1) + ":");
            products[i].displayDetails();
          }
        sc.close();
	}
}
