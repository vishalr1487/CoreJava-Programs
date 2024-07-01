package interviewPrograms;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,40,50,786, 900};
		
		int max=a[0], min=a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];  
			}
			else {
				if(a[i]<min) {
					min=a[i];
				}
			}
		}
	
		
		/// length of the string without using length method 
		// remove special chars, capital letters, small letters in given string
		
		System.out.println("Minimum number in the given array is :" + " " + min);
		System.out.println("Maximum number in the given array is : " + " " + max);

		
		
	}

}
