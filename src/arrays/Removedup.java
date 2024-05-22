package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Removedup {

	public static void main(String[] args) {
		
		
		int[] arr={1,2,2,3,4,5,5,6,4,4,3,3};  // UNSORTED ARRAY
		
		Arrays.sort(arr);
		
		ArrayList<Integer> nondup = new ArrayList();
		
		
		for(int i=0; i<arr.length-1; i++) {
			
			if(arr[i]!=arr[i+1]) {
				nondup.add(arr[i]);
			}
		}
		
		 nondup.add(arr[arr.length-1]);
		 
		 System.out.println(nondup);
		
		
	       
	     
	}

}
