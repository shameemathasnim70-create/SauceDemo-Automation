package wrapper;

public class WrapperExample {

	public static void main(String[] args) {
		
		int a=25;
		Integer b = Integer.valueOf(a);
		int c=b.intValue();
		 
		System.out.println("primitive int" +a);
		System.out.println("Integer object"+b);
		System.out.println("back to primitive" +c);
		
	}

}
