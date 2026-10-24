package exceptionexamples;

public class ExceptionExample4 {

	public static void main(String[] args) {
		try {
		String name =null;
		System.out.println(name.length());
		}
		catch(NullPointerException n) {
			System.out.println("String is null"+n);
			
		}
	}

}
