package exceptionexamples;

public class ExceptionExample1 {

	public static void main(String[] args) {
		try {
		int a=10;
		int b=0;
		int result =a/b;//error
		System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divided by zero"+e);
		}
		
		System.out.println("program continues..");

	}

}
