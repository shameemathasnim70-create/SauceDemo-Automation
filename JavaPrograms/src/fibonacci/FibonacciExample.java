package fibonacci;

public class FibonacciExample {

	public static void main(String[] args) {
		int n=15;
		int a=0, b=1, c;
		
		System.out.println(a +" "+b+" ");
		
		for(int i=2; i<n; i++) {
			c=a + b;
			System.out.println(c +" ");
			a= b;
			b= c;
		}
	}

}
