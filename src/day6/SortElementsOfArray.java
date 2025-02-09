package day6;
import java.util.Arrays;
public class SortElementsOfArray {

	public static void main(String[] args) {
		int array[] = { 89, 76, 2, 34, 5, 7, 56};
		Arrays.sort(array);
		System.out.println("Elements of array in ascending order: ");
		for(int value : array) {
			System.out.print(value + "   ");
		}

	}

	
	public static void sortMyarray(int[] givenArray) {
		int length = givenArray.length;
        for(int i=0; i<length; i++) {
        	for(int j=0; j<length; j++) {
        		if(givenArray[j] > givenArray[j+1]) {
        			int temp = givenArray[j];
        			givenArray[j] = givenArray[j+1];
        			givenArray[j+1]=temp;
        		}
        	}
        }
        
        System.out.println("Sorted array: ");
        
        for(int value: givenArray) {
        	System.out.print(value + "\t");
        }
	}
}
