package Corejava;
/*
 Author : Arun 
 
 Static Key word is used in 5 cases, 
 1. Static Variable 
 We can use static keyword with a class level variable, shared across all the instances of Object
 2. Static Methods
 3. Static Block
 4. Static inner class 
 5. Interface Static Method ( Java8)

 */

public class java04StaticBreackContinue {
	static int i=1000;
	
	static int sum2vals(int i1, int i2) {
		System.out.println("Static method called ............");
		return i1+i2;
	}
	
	static {
		System.out.println("Inside static block ........");
		i=sum2vals(100, 200);
	}
	
	public static class innerClass{
		innerClass(){
			System.out.println("innerclass instance created .......!");
			
		}
	}

}
