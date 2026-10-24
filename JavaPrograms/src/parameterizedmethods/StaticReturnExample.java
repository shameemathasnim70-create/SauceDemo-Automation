package parameterizedmethods;

public class StaticReturnExample {
	
	public static int multiply(int a,int b) {
		return a*b;
	}

	public static void main(String[] args) {
		int result=multiply(11,11);
		System.out.println(result);

	}

}
