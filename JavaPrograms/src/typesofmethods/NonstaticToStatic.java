package typesofmethods;

public class NonstaticToStatic {
	
	public static void method1() {
		System.out.println("Inside non static method2");
		NonstaticToStatic.method1();
	}

	public static void main(String[] args) {
		NonstaticToStatic.method1();
	
	}

}
