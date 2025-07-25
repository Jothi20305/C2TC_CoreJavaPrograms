package daysix.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {
		System.out.println(Employee.companyName);
		Employee e = new Employee("Shubh", 123);
		System.out.println(e);
		
		
		e = new Employee("Deep", 321);
		System.out.println(e);
	}
}
