package javakeywordsexamples;

public class Student {
	
	int id;
	String name;//instance variable/global variable
	Student(int id,String name){
		this.id =id;//class instance variable
		this.name =name;
	}
	
	public void display() {
		System.out.println(id+""+name);
	}
	

	public static void main(String[] args) {
	Student s1=new Student(101,"Ajay");
	Student s2=new Student(102,"Rohit");
	Student s3=new Student(103,"chichu");
	Student s4=new Student(104,"abi");
	s1.display();
	s2.display();
	s3.display();
	s4.display();
	
	}
	

	}


