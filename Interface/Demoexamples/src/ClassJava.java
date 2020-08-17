
public class ClassJava implements Interfacejava8{
	
	
	public void discuss() {
		System.out.println("Discuss method in class");
	}
	 
	
	interface funcInterface{
		int operators(int a, int b);
	}
	
	interface funcInterfaceII{
		void sayMessage(String Msg);
	}
	public static void main(String[] args) {
		
		
		
		ClassJava cj = new ClassJava();
		cj.method();
		Interfacejava8.hiMethod();
		cj.discuss();
		

	}

}
