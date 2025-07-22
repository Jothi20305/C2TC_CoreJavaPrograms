package entityclassassignment1;
import java.util.*;
public class Student { 
	int id;
	String name;
	int age;
void readDetails(Scanner sc) {
    System.out.print("Enter student ID: ");
    id = sc.nextInt();
    sc.nextLine(); 
    System.out.print("Enter student name: ");
    name = sc.nextLine();
    System.out.print("Enter student age: ");
    age = sc.nextInt();
}
void displayDetails() {
    System.out.println("ID   : " + id);
    System.out.println("Name : " + name);
    System.out.println("Age  : " + age);
	}
}
