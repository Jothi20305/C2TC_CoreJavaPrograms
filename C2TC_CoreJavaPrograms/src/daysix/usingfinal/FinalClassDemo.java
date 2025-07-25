package daysix.usingfinal;

public class FinalClass {

	public static void main(String[] args) {
		void show() {
			System.out.println("Final class cannot be inherited");
		}
	}
	class FinalChildClass extends FinalClassDemo {
	}

	public class FinalClassDemo {
		public static void main(String[] args) {
			// Create the object of final class
			FinalClass f1 = new FinalClass(); // Call show() method using object reference variable ab.
			f1.show();
		}

	}

}
