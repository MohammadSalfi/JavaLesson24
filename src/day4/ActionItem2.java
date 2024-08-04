package day4;

public class ActionItem2 {

	public static void main (String[] args) {
		
		System.out.println("Factorial is: " + doFactorial(44));
		System.out.println("Fahrenheit value is:" + convertToFahrenheit(33));
	}
	
	public static long doFactorial(int number) {
		//Declare a new int type variable
		
		long factorial = 1;
		
		while(number > 1) {
			factorial *=number; //we are multiplying subsequent values with factorial
			number --; //decrementing the given number in every iteration
		}
		
		return factorial; //returning the calculation value
	}
	
	public static double convertToFahrenheit(int celcius) {
		double fahrenheit;
		fahrenheit = ((celcius * 9 )/5) + 32;
		return fahrenheit;
	}
	
}
