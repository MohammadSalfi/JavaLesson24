package day2;

public class IncrementOperatorDemo {

	public static void main(String[] args) {
		int a = 10;
//		a = a + 1;
		a++;
		System.out.println(a);
		
		// Post Increment
		int x = 10;
		int result = x++;
		
		System.out.println(result);
		
		// Pre Increment 
		int b = 10;
		int res = ++b;
		
		System.out.println(res);
	}

}
