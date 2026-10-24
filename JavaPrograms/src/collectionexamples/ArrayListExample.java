package collectionexamples;

public class ArrayListExample {

	public static void main(String[] args) {
	
		ArrayList<String>students = new ArrayList <>();
		students.add("Anu");
		students.add("Meera");
		students.add("Jethin");
		System.out.println("student list :"+students);
		students.remove("Meera");
		System.out.println("after removal:"+students);
		System.out.println("first student:"+students.get(0));

	}

}
