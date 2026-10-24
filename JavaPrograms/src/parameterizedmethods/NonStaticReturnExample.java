package parameterizedmethods;

public class NonStaticReturnExample {

	public int add(int num) {
		return num*num;
		
	}
	
	public static void main(String[] args) {
		
		NonStaticReturnExample obj = new NonStaticReturnExample();
	int result =obj.add(5);
	System.out.println(result);
		
	}

}
