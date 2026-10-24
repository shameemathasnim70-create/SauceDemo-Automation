package stringfunctions;

public class StringExampletwo {

	public static void main(String[] args) {
		
		String s="Java programming";
		System.out.println(s.contains("Java"));
		
		String s1="Java programming";
		System.out.println(s1.startsWith("Java"));
		System.out.println(s1.endsWith("ing"));
		 
		String s2="Java programming";
		System.out.println(s2.indexOf('a'));
		System.out.println(s2.indexOf('g'));
		
		System.out.println(s2.substring(4));
		System.out.println(s2.substring(0, 4));
				
	}

}
