package day2;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		/*int age = 25;
		
		String result = (age >= 18) ? "Eligible to vote" : "Not Eligible to vote";
		
		System.out.println(result);

		*/
		
		
		int a = 25 , b =10;
		/*
		
		int money = 30;
		
		String result = (money >= 10) ? "b is going to be 25 and a is going to be 10" : 
			"a is going to be 25 and b is going to be 10";
			
		System.out.println(result);
		*/
		
		System.out.println("initial value of a is:" + a + " and b is:" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("Final value of a is:" + a + " and b is:" + b);
		
	}

}
