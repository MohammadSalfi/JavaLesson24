package day4;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		int a[][] = new int [3][2];

		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		System.out.println(a[1][1]);
		
		int b [][] = {{1,2,10}, {3,4,23}, {5,6,24,67,45}};
		System.out.println(b[2][1]);
		
		for(int i=0; i<a.length; i++) {
			for (int j=0; j <a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		System.out.println("Printing all the values from b array");
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.println(b[i][j]);
			}
			
		}
		
		System.out.println("Extracting all the values using enhanced for loop");
		for(int arr[]:b) {
			for(int var :arr) {
				System.out.print(var + "  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}