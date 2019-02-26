package Corejava;
/*
 Constructors are almost similar to methods except for two things –
  it’s name is same as class name and it has no return type
 	1. Default Constructor
	2. No-Args constructor
	3. Parameterized constructor

 
 */

public class Java02Constructor {
	
	public Java02Constructor() {
		System.out.println("Constructor no args  ................!");
	}
	
	private String name;
	public Java02Constructor(String s1) {
		this.name=s1;
	}
	public String getString() {
		return name;
	}
	
	public Java02Constructor(String s2, int times) {
		for(int i=0;i<times;i++) {
		System.out.println(s2);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java02Constructor j0=new Java02Constructor();
		Java02Constructor j1=new Java02Constructor("Parameterized T1111111111111111111111111111...........");
		System.out.println(j1.getString());
		Java02Constructor j2= new Java02Constructor("Arun",10);
		
	}

}
