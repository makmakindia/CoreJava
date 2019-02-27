package Corejava;

/*
 Java break statement is used to terminate the loop
 2 types of break statements 
 1. unlabeled 
 2. Labled
 
 */

public class java04Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.out.println(" org static variable i value  : "+java04StaticBreackContinue.i);
	//	int x = java04StaticBreackContinue.i;
		java04StaticBreackContinue.i=20;
		
		System.out.println(" Now updated static i value : "+java04StaticBreackContinue.i);
		
		// static method called 
		int add2vals = java04StaticBreackContinue.sum2vals(10, 30);
		System.out.println(" Sum of 10 and 30 : "+add2vals);
		
		java04StaticBreackContinue.innerClass ic=new java04StaticBreackContinue.innerClass();
		
		
		java04MyInterface.foo();
		
		String[] arr= {"A","R","U","N","K","U","M","A","R"};
		
		
			for( int len=0; len<arr.length; len++) {
				
				if(arr[len].equals("K")) {
					System.out.println("haha ..................");
					System.out.println(" K index at   "+len+" Array value is :  "+arr[len]+"   executeing break statement");
					break;
				}
		}
			
			int[][] arr1 = { { 1, 2 }, { 3, 4 }, { 9, 8,7,11 }, { 10, 12 } };
			boolean found1 = false;
			int row = 0;
			int col = 0;
			searchint:
				for (row = 0; row < arr1.length; row++) {
					for (col = 0; col < arr1[row].length; col++) {
						if (arr1[row][col] > 10) {
							found1 = true;
							// using break label to terminate outer statements
							break searchint;
						}
					}
				}
				if (found1)
				{
					System.out.println("First int greater than 10 is found at index: [" + row + "," + col + "]");
			}
				
				int[] intArray = { 10, 20, 3, 40, 5, 69, 70 };

				// we want to process only even entries
				for (int i : intArray) {
					if (i % 2 != 0)
						continue;
					System.out.println("Processing entry " + i);
				}
		

}
}

