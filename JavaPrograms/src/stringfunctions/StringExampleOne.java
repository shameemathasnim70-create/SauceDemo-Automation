package stringfunctions;

public class StringExampleOne {

	public static void main(String[] args) {
		
		String s="java";
		System.out.println(s.length());
		System.out.println(s.charAt(1));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//difference between equal and equal ingnore case.
		
		String a="java";
		String b="java";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		String s1="hello";
		String s2=" world";
		System.out.println(s1.concat(s2));
		
		
	}

}
