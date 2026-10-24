package staticandnonstatic;

public class StaticAndNonStatic {
	
	public static void greet() {
		System.out.println("Hello");
	}
	void message() {
		System.out.println("Welcome");
	}
	
	public static void main(String[] args) {
		greet();
		
		
		StaticAndNonStatic obj =new StaticAndNonStatic();
		obj.message();

	}

}
