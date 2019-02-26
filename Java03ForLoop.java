package Corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Java03ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=10;i++) {
			System.out.println("Simple For loop : "+i);
		}
		
		int[] intArray= {11,12,13,14,15};
		
		for(int i:intArray)
			System.out.println("For each Loop Array Collection "+i);
		
		List<String> fruits=new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		for(String f:fruits)
			System.out.println("For each Loop List collection - "+f);
		
	

int[][] intArr = { { 1, -2, 3 }, { 0, 3 }, { 1, 2, 5 }, { 9, 2, 5 } };

process: for (int i = 0; i < intArr.length; i++) {
	boolean allPositive = true;
	for (int j = 0; j < intArr[i].length; j++) {
		if (intArr[i][j] < 0) {
			allPositive = false;
			continue process;
		}
	}
	if (allPositive) {
		// process the array
		System.out.println("Processing " + Arrays.toString(intArr[i]));
	}
	allPositive = true;
}

System.out.println("While ...................!");
List<String> veggies = new ArrayList<>();
veggies.add("Spinach");
veggies.add("Potato");
veggies.add("Tomato");

Iterator<String> it = veggies.iterator();

while(it.hasNext()) {
System.out.println(it.next());
}




	}
	
	

	

}
