package abstractexample;

public abstract class Coder {
	protected static final String wakeup="5 AM";
	
	//Abstract method declared
	abstract public void rules();
	
	//concrete  method
	public void show() {
		System.out.println("To Become a Coder, Early morning practical needed");
	}
}
