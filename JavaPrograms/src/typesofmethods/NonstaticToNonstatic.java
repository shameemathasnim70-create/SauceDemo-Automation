package typesofmethods;

public class NonstaticToNonstatic {
	public void method1() {
		System.out.println("Inside non static method 1");
	}
	
	public void method2() {
		System.out.println("Inside non static method 2");
		method1();
	}
	public static void main(String[] args) {
		//Syntax of obj creation
		NonstaticToNonstatic obj = new NonstaticToNonstatic();
		obj.method2();

	}
		

	}


