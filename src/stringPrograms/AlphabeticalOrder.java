package stringPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		
		
		ArrayList<String> a=new ArrayList<>();
		a.add(" Java ");
		a.add(" Manual  ");
		a.add(" Testing ");
		a.add(" Coding ");
		a.add(" Automation ");
		
		
		System.out.println("UnSortedArray is: " + a);
		
		Collections.sort(a);
		
		System.out.println("Sorted Array is:" + a);
		
		
		
		
		
		
		

	}

}
