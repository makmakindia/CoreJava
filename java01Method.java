package Corejava;

/*
 Name : Arun M 
 Various components of a java method.
 1. Access Modifiers
 2. Return Type 
 3. Method Name 
 4. Method Parameter
 5. Exceptions List 
 6. Method Body
 
 Method 1 : Overloaded Methods
 Method 2: Method Throwing Exception
 Method 3: Recursive Method
 Method 4: Method Calling Another Method
 
 */
public class java01Method {
	
	/* Method 1 : Overloaded Methods: If a class have multiple methods with the same name, 
	they are called as overloaded methods
	see below add method is overloaded 
	*/
	private void getStr(String s1) {
		
	}
	public  int add(int x, int y) {
		return x+y;
	}
	public  int add(int x, int y, int z) {
		return x+y;
	}
	
	// Method 2: Method Throwing Exception:  Java method with IlligalArgumentException
	public int devide(int x, int y) throws IllegalArgumentException{
		
		if(y==0) throw new IllegalArgumentException("Can't devide by 0 .... ");
		return x/y;
	}
	// Method 3: Recursive Method : When a method calls itself, it's called as a recursive method
	
	public static long factorial(long n) {
		if(n==1)
			return n;
		else
			return(n*factorial(n-1));
	
	}
	
	//Method 4: Method Calling Another Method: call another method from a method
	public void javaPrint(String s) {
		System.out.println(s);
	}
	public void javaPrint(String s1, int times) {
		for(int i=0; i<times; i++) {
			javaPrint(s1);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java01Method a=new java01Method();
		
		System.out.println("Sum of 2 numbers : "+a.add(2, 3));
	//	System.out.println("Statuc method called here with String - "+java01Method.javastatmethod("Arun"));
		System.out.println("Device 2 numbers : "+a.devide(10, 10));
		System.out.println("Factorial using Recursive function : "+factorial(4));
		a.javaPrint("Method ",5);
		
		
		
	}

}
