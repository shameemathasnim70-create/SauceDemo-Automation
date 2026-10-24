package exceptionexamples;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample2 {
	public static void test()throws IOException,ArithmeticException{
		int a =10/0;
		FileReader file =new FileReader("Test.txt");
	}
	
	
	public static void main(String[] args) {
		try {
			test();
		}
		catch(Exception e) {
			System.out.println("Exception occured:"+e);
		}
		

	}

}
