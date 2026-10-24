package parameterizedmethods;

public class NonStaticParameterized {
	
	public void add(int a,int b) {
		System.out.println("sum :" +(a+b));
	}
	

	public static void main(String[] args) {
		NonStaticParameterized obj =new NonStaticParameterized();
		obj.add(100,200 );//call
	

	}

}
