package day4;

public class WhileLoop {

	public static void main(String[] args) {
		
		// initialization; condition/logic; increment/decrement;
/*
		System.out.println("*****Using for loop*****        ".repeat(2));
		for (int num = 0; num < 6; num++) {
			System.out.println(num);

		}
		
		System.out.println("*****Using While loop*****       ".repeat(2));
	//print 1 to 5 using while loop
	int num = 1 ; 
	while(num <= 5) {
		System.out.println(num);

		num++;
	}

	System.out.println("*****Using While loop*****       ".repeat(2));
	int number = 1;
	do {
		System.out.println("Salfi");
		number++;
		
	} while(number <=5);
	*/
		//Situation 1
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			
			if(i==5) {
				break;//this is a jumping statement
			}
			
		}
		
		//Situation 2
		System.out.println("Situation 2");
		
		for(int i=1; i<=10; i++) {
			if (i==5) {
				continue;  //Skip the current sequence
			}
			System.out.println(i);
			
			
		}
	}
}