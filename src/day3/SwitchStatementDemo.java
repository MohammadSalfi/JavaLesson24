package day3;

public class SwitchStatementDemo {

	public static void main(String[] args) {
		
		/*switch(variable) {
		case 1: {
			break;
		}
		case 2: {
			break;
		}
		default:
		{
			//
		}
		*/
		
		int num = 3;
		switch (num) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		default: {
			System.out.println("This number is not any day of the week");
		}
		}
		
		System.out.println("out of switch statement");
	}

}
