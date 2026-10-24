package exceptionexamples;

public class ExceptionExample3 {

	public static void main(String[] args) {
		try {
		int  num=10/2;
		}
		catch(ArithmeticException e) {
			System.out.println("Except.handling :"+e);
		}
		finally {
			System.out.println("finally block always execute :");
		}
	}

}
