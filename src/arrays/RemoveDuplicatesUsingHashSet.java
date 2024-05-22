package arrays;

import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicatesUsingHashSet {

	public static void main(String[] args) {
		
		
	ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,22,22,2,3,4,5,6,22,1,3));
		
	LinkedHashSet<Integer> linkedHashset=new LinkedHashSet<Integer>	(numbers);
	 
	ArrayList<Integer> numberswithoutduplicates= new ArrayList<Integer>(linkedHashset);
	System.out.println(numberswithoutduplicates);
		

	}

}
