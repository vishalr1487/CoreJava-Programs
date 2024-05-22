package arrays;

import java.util.HashSet;

public class RemoveDuplicateUnsortedArray {

	public static void main(String[] args) {
		
		
		int[] arr= {2,3,1,4,5,1,6};
		// here we are using hashset because hashset doesn't allow duplicate values.
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			hs.add(arr[i]);
		}
		
		for(int number:hs) {
			System.out.print( number + " ");
		}
		
		
		
		
		

	}

}
