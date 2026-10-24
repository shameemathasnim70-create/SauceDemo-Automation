package exceptionexamples;

public class ThrowExample1 {

	public static void main(String[] args) {
	int age=16;
	if(age<18)
	{
		throw new ArithmeticException("Not eligible to work");
	}
	else
	{
		System.out.println("Eligible to work");
	}

	}

}
