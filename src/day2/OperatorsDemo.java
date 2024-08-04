package day2;

public class OperatorsDemo {

	public static void main(String[] args) {
		int a = 20 , b = 10;
		
		System.out.println("Sum of a and b is:" + (a+b));
		System.out.println("Difference of a and b is:" + (a-b));
		System.out.println("Multiply of a and b is:" + (a*b));
		System.out.println("Divide of a and b is:" + (a/b));
		System.out.println("Modulus of a and b is:" + (a%b));
		
		System.out.println("Relational Operators    ".repeat(3));
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		
		System.out.println("Logical Operators    ".repeat(6));
		
		boolean x = true , y = false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(! y);
		System.out.println(! x);
	}
	
	
	
}
