package stringfunctions;

public class StringExampleFour {

	public static void main(String[] args) {
		
		String s = "Java";
		s.concat("world");
		System.out.println(s);
		
		//string builder is mutable
		StringBuilder sb =new StringBuilder("Java");
		sb.append("world");
		System.out.println(sb);
		
		//stringBuffer is mutable
		StringBuffer Sf =new StringBuffer("Java");
		Sf.append(" world ");
		System.out.println(Sf);

	}

}
