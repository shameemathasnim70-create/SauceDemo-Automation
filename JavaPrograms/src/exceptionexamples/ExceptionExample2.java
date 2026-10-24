package exceptionexamples;

public class ExceptionExample2 {

	public static void main(String[] args) {
		try {
		int[]array= {10,20,30};
		System.out.println(array[5]);
		}
		catch(ArithmeticException e) {
			System.out.println("Aritmetic exception :"+e);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index error:"+e);
		}
		catch(Exception e) {
			System.out.println("General exception :"+e);
		}
	}
	
}
