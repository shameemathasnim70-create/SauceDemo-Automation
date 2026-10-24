package typesofmethods;

public class StatictToStatic {

	public static void  ) {
		System.out.println("Inside static method 1");
	}
	
	public static void method 2() {
		System.out.println("inside static method 2");
		method1();

	}

}



public static void main(String[] args) {
	// static call static
	method2();
}