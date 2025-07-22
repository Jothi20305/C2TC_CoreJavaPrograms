package entityclassassignment1;
import java.util.*;
public class Entityclassassignment1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];      
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new Student(); // create a new Student object
            students[i].readDetails(sc);
        }
        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            students[i].displayDetails();
        }

        sc.close();

	}

}
