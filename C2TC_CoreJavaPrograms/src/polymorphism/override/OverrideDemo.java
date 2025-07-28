package polymorphism.override;

public class OverrideDemo {

	public static void main(String[] args) {
		PLTraining p1=new PLTraining();
		p1.session("Full Stack Developer");
      
		//JFS Object
		p1=new JFS();
		p1.session("Method Overriding");
		
		//Python Object
		p1=new Python();
		p1.session("Method Overriding");
	}

}
