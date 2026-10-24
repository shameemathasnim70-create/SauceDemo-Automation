package conditionstatements;

public class SwitchExample {

	public static void main(String[] args) {
		int day=3; // variable
		switch(day)
		{
		case 1:
			System.out.println("sunday");
		break;
		case 2 :
			System.out.println("monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		default:
			System.out.println("Invalid day");
		
		}

	}

}
