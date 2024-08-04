package day4;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int myArray[] = new int [5];

		myArray[0]=10;
		myArray[1]=20;
		myArray[2]=30;
		myArray[3]=40;
		myArray[4]=50;
		
		System.out.println(myArray[4]);
		
		int length = myArray.length;
		System.out.println("The length is:   " + length);
//declaring and assigning values at one go		
		int a[] = {1, 2, 3, 4, 5};
		System.out.println(a[4]);
//Extracting all the values or printing all the values out of an array		
		System.out.println(Arrays.toString(a));
// print all the values using for loop
		
		for(int i=0; i<5; i++) {
			System.out.println(myArray[i]);
		}
		
// use enhanced for loop to print all the values of our array
		System.out.println("Using enhanced for loop");
		for(int mA :myArray) {
			System.out.println(mA);
		}
		System.out.println("Printing in reverse order");
		for(int i = 4; i>=0; i--) {
			System.out.println(myArray[i]);
		}
	}
}
