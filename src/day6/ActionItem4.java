package day6;

public class ActionItem4 {

	public static void main(String[] args) {
/*
		int[] myArray = {23, 6, 8,  34, 87, 53, 88};
		int sum = 0;
		for(int value : myArray) {
			sum = sum + value;
		}
		
		System.out.println("The sum of all my array is:  " + sum);
*/
		
		int[] arr = {2, 7, 3, 78, 23, 44, 66, 35};
		System.out.println("Printing all odd numbers:  ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 !=0) {
				System.out.println(arr[i]+ "  ");
			}
		}
		System.out.println();
		
		System.out.println("Printing all even numbers:  ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i]+ "  ");
			}
		}
	}

}
