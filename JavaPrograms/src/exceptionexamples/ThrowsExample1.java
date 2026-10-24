package exceptionexamples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample1 {

	//public static void main(String[] args) throws FileNotFoundException {
	//	FileReader file=new FileReader("Test.txt");
	public static void main(String[]args)throws IOException{
		FileReader file =new FileReader ("Test.txt");
		

	}

}
