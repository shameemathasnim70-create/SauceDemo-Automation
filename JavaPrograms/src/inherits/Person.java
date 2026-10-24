package inherits;

public class Person {
	void displayPerson() {
		System.out.println("person details");
	}

}
  class Student extends Person{
	  void displayStudent() {
		  System.out.println("Student details");
	  }
	  
  
  public class Main{
	  public static void main(String[] args) {
		  Student obj =new Student();
		  obj.displayPerson();
		  obj.displayStudent();
	  }
	  
	  }
  }
