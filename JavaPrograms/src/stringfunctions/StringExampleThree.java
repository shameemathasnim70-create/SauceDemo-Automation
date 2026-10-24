package stringfunctions;

public class StringExampleThree {

	public static void main(String[] args) {
		String s4= " java ";
		System.out.println(s4.trim());
		
		
		String s5 = "Java,Python,c++";
		String[] array=s5.split(",");
			for(String lang:array)
				System.out.println(lang);
			
			String s6="Java";
			System.out.println(s6.replace('J', 'L'));
			
		
	}

}
